package com.javarush.task.task39.task3913;

import com.javarush.task.task39.task3913.query.IPQuery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LogParser implements IPQuery{
    private Path logDir;
    private DateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy H:m:s");
    private List<LogEntity> logEntities = new ArrayList<>();
    public LogParser(Path logDir) {
        this.logDir = logDir;
        readLogs();
    }
    private void readLogs(){
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(logDir)) {
            for(Path file : directoryStream){
                if(file.toString().toLowerCase().endsWith(".log")){
                    try(BufferedReader reader = new BufferedReader(new FileReader(file.toFile()))){
                        String line = null;
                        while((line = reader.readLine()) != null){
                            String [] params = line.split("\t");

                            if(params.length != 5)continue;

                            String ip = params[0];
                            String user = params[1];
                            Date date = readDate(params[2]);
                            Event event = readEvent(params[3]);
                            int eventAdditionalParameter = -1;
                            if(event.equals(Event.SOLVE_TASK) || event.equals(Event.DONE_TASK)){
                                eventAdditionalParameter = readAdditionalParameter(params[3]);
                            }
                            Status status = readStatus(params[4]);

                            LogEntity logEntity = new LogEntity(ip,user,date,event,eventAdditionalParameter,status);
                            logEntities.add(logEntity);
                        }
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Date readDate(String stringToDate){
        Date date = null;
        try{
            date = simpleDateFormat.parse(stringToDate);
        } catch (ParseException e) {
            System.out.println("Invalid date");
            e.printStackTrace();
        }
        return date;
    }
    private Event readEvent(String stringToEvent){
        Event event = null;
        if(stringToEvent.contains("SOLVE_TASK")){
            event = Event.SOLVE_TASK;
        } else if (stringToEvent.contains("DONE_TASK ")) {
            event = Event.DONE_TASK;
        }else{
            switch (stringToEvent){
                case "LOGIN" : {
                    event = Event.LOGIN;
                    break;
                }
                case  "DOWNLOAD_PLUGIN" :{
                    event = Event.DOWNLOAD_PLUGIN;
                    break;
                }
                case "WRITE_MESSAGE" :{
                    event = Event.WRITE_MESSAGE;
                    break;
                }
            }
        }
        return event;
    }
    private int readAdditionalParameter(String stringToParameter){
        if(stringToParameter.contains("SOLVE_TASK ")){
            stringToParameter = stringToParameter.replace("SOLVE_TASK ", "").replaceAll(" ", "");
            return Integer.parseInt(stringToParameter);
        }else{
            stringToParameter = stringToParameter.replace("DONE_TASK", "").replaceAll(" ", "");
            return Integer.parseInt(stringToParameter);
        }
    }
    private Status readStatus(String stringToStatus){
        Status status = null;
        switch (stringToStatus){
            case "OK":{
                status = Status.OK;
                break;
            }
            case "FAILED":{
                status = Status.FAILED;
                break;
            }
            case "ERROR":{
                status = Status.ERROR;
                break;
            }
        }
        return status;
    }
    private boolean dateBetweenDates(Date current, Date after, Date before){
        if(after == null){
            after = new Date(0);
        }
        if(before == null){
            before = new Date(Long.MAX_VALUE);
        }
        return current.after(after) && current.before(before);
    }


    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        return getUniqueIPs(after, before).size();
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        Set<String> result = new HashSet<>();
        for(int i = 0; i< logEntities.size(); i++){
            if(dateBetweenDates(logEntities.get(i).getDate(), after,before)){
                result.add(logEntities.get(i).getIp());
            }
        }
        return result;
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        return null;
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        return null;
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        return null;
    }
    private class LogEntity{
        private String ip;
        private String user;
        private Date date;
        private Event event;
        private int eventAdditionalParameter;
        private Status status;

        public LogEntity(String ip, String user, Date date, Event event, int eventAdditionalParameter, Status status) {
            this.ip = ip;
            this.user = user;
            this.date = date;
            this.event = event;
            this.eventAdditionalParameter = eventAdditionalParameter;
            this.status = status;
        }

        public String getIp() {
            return ip;
        }

        public String getUser() {
            return user;
        }

        public Date getDate() {
            return date;
        }

        public Event getEvent() {
            return event;
        }

        public int getEventAdditionalParameter() {
            return eventAdditionalParameter;
        }

        public Status getStatus() {
            return status;
        }
    }
}