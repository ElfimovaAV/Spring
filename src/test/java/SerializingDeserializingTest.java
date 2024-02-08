import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gb.home1.domain.Person;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializingDeserializingTest {
    @Test
    @DisplayName("Проверка сериализации в формат JSON объектов класса Person с помощью библиотеки gson")
    public void serializingTest() {
        List<Person> list = Arrays.asList(new Person("Marina", "Orlova", 15),
                new Person("Philipp", "Troekurov", 33));

        Gson gson = new Gson();
        String jsonString = gson.toJson(list);
        String expectedString = "[{\"firstName\":\"Marina\",\"lastName\":\"Orlova\",\"age\":15},{\"firstName\":\"Philipp\",\"lastName\":\"Troekurov\",\"age\":33}]";

        Assertions.assertEquals(expectedString, jsonString);
    }

    @Test
    @DisplayName("Проверка десериализации из формата JSON объектов класса Person с помощью библиотеки gson")
    public void deserializingTest() {
        String inputString = "[{\"firstName\":\"Marina\",\"lastName\":\"Orlova\",\"age\":15},{\"firstName\":\"Philipp\",\"lastName\":\"Troekurov\",\"age\":33}]";
        List<Person> inputList = Arrays.asList(new Person("Marina", "Orlova", 15),
                new Person("Philipp", "Troekurov", 33));

        Type listOfMyClassObject = new TypeToken<ArrayList<Person>>() {}.getType();

        Gson gson = new Gson();
        List<Person> outputList = gson.fromJson(inputString, listOfMyClassObject);

        Assertions.assertEquals(inputList, outputList);
    }
}
