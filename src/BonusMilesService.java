public class BonusMilesService {

    public int calculate(int price) {
        int percent = 5; // процент с покупки билета

        int bonus  = price * percent / 100;

        return bonus;
    }

}


//int percent = 5; // процент с покупки билета

//int bonus = amount * percent / 100;

//System.out.println("Стоимость билета:" + amount + " рублей ");
//System.out.println("Накопленные мили:" + bonus)