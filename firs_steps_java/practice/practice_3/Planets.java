// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;

public class Planets {
    public static void main(String[] args) {

        ArrayList<String> planets = getPlanets();

        repeatPlanet(planets);
        System.out.println(planets);
        delitePlanet(planets);
        System.out.println(planets);
    }

    private static ArrayList<String> getPlanets() {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Уран");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Сатурн");
        planets.add("Нептун");
        return planets;
        
    }

    static void repeatPlanet(ArrayList<String> planets) {
        int count = 1;
        ArrayList<String> planetsSort = new ArrayList<>(planets);
        Collections.sort(planetsSort);
        // System.out.println(planetsSort);
        for (int i = 1; i < planetsSort.size(); i++) {
            if (planetsSort.get(i) == planetsSort.get(i - 1)) {
                count++;

            } else {
                System.out.println(planetsSort.get(i - 1) + " -> " + count);
                count = 1;
            }
            
        }
        System.out.println(planetsSort.get(planetsSort.size() - 1 ) + " -> " + count);

    }

    static void delitePlanet ( ArrayList<String> planets){
        for (int i = 0 ; i < planets.size();i++){
            for(int j = i+1 ; j < planets.size() ; j++){
            //for(int j =  planets.size() - 1  ; j > i ;j--){
                if (planets.get(i).equals(planets.get(j)) ){
                    planets.remove(j);
                    j--;
                }
                
            
            }
        }
    }

}