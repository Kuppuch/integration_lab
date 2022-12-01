package org.example;

import org.w3c.dom.ls.LSOutput;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException, JAXBException {
        Scanner keyboard = new Scanner(System.in);
        int in = 0;
        do {
            System.out.println("-----------------------------\n" +
                    "Выберите действие: \n" +
                    "1 - Список задач \n" +
                    "2 - Добавить задачу \n" +
                    "3 - Получить задачу \n" +
                    "4 - Удалить задачу \n" +
                    "0 - Выход \n"
            );
            in = keyboard.nextInt();

            switch (in) {
                case 1:
                    String result = Web.getIssues();
                    System.out.println(result);


                    break;
                case 2:
                    int j = 0;
                    Issue issue = new Issue();

                    issue.id = Instant.now().getEpochSecond();

                    System.out.println("Введите название задачи");
                    issue.name = keyboard.next();

                    System.out.println("Введите описание задачи");
                    issue.description = keyboard.next();

                    issue.created_at = new Date();

                    System.out.println("Введите планируюмую дату начала работы над задачей YYYY-MM-DD");
                    String stringDate = keyboard.next();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                    Date date = formatter.parse(stringDate);
                    issue.start_at = date;

                    System.out.println("Введите дату дедлайна в формате YYYY-MM-DD");
                    stringDate = keyboard.next();
                    formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                    date = formatter.parse(stringDate);
                    issue.due_date = date;

                    System.out.println("Введите статус");
                    issue.status = keyboard.next();

                    System.out.println("Введите текст задачи");
                    issue.srsBlock = keyboard.next();

                    while (true) {
                        System.out.println("Введите приоритетность от 0 до 9");
                        issue.priority = keyboard.nextInt();
                        if (issue.priority < 0 || issue.priority > 9) {
                            System.out.println("Сказано же, от 0 до 9");
                            continue;
                        }
                        break;
                    }


                    System.out.println("Введите id родительской задачи (не обязательно. Введите 0, если не хотите)");
                    issue.parent = keyboard.nextInt();

                    try {
                        JAXBContext context = JAXBContext.newInstance(Issue.class);
                        javax.xml.bind.Marshaller m = context.createMarshaller();
                        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                        StringWriter sw = new StringWriter();
                        m.marshal(issue, sw);
                        String finalXML = sw.toString().substring(62, sw.toString().length() - 9);
                        finalXML = "<arg0" + finalXML;
                        System.out.println(finalXML);

                        Web.addIssue(finalXML);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

            }


        } while (in != 0);

    }
}