public class PhraseOMatic{
    public static void main(String[] args){
        String[] countries = { "China", "Usa", "Germany",
        "Nigeria", "Cote d'Ivoire", "Ghana", "Russia", "Japan"
        };
        // for (String country : countries){
        //     System.out.print(country + " ");
        // }
        String[] cities = { "Paris", "London", "New York", "Charlotte",
        "Lagos", "Abuja", "Jersity City"
        };
        // for (String city : cities){
        //     System.out.println(city);
        // }
        String[] continents = {
            "Africa", "South America", "North America", "Asia"
        };
        // for (String continent : continents){
        //     System.out.print(continent + " ");
        // }

        int countriesLength = countries.length;
        int citiesLength = cities.length;
        int continentsLength = continents.length;
        // System.out.println(countriesLength);
        // System.out.println(citiesLength);

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(countriesLength);
        // System.out.println(rand1);
        int rand2 = randomGenerator.nextInt(100);
        // System.out.println(rand2);
        int rand3 = randomGenerator.nextInt(citiesLength);
        // System.out.println(rand3);

        String phrase = cities[rand3] + " " + countries[rand1];
        System.out.println(phrase);
        
    }
}