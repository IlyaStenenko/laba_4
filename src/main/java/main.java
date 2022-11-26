

import java.io.FileReader;
import au.com.bytecode.opencsv.*;
import java.util.ArrayList;

public class main {

    public static void main(String... A) throws Exception
    {
        ArrayList<Person> P = new ArrayList<Person>();
        CSVReader input = new CSVReader(new FileReader("C:\\Users\\ILYA\\IdeaProjects\\laba_4\\src\\main\\resources\\F.csv"), ';' ,'"' , 1);
        //Путь к папке resources простой не хотел воспринимать ,хотя в idle показывался имеенно этот путь,тоесть idle этот файд в resources видит
        //Поэтому пришлось указать полный путь
        String[] nextLine = input.readNext();
        while ((nextLine) != null) {
            Person I = new Person(nextLine);
            P.add(I);
            nextLine = input.readNext();
        }

        for (int i = 0;i < P.size();i++)
        {
            System.out.println(P.get(i).toString());
        }

    }


}
