package LSP.AF;

import java.sql.Date;

class Vegetable extends FoodProduct {
    @Override
    String getName() {
    return "Broccoli";
    }
    @Override
    Date getExpiredDate() {
    return new Date(2023,10,19);
    }
}