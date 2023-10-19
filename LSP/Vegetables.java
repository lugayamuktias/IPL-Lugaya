package LSP;

import java.util.Date;

class Vegetables extends FoodProduct {
 @Override
 String getName() {
 return "Broccoli";
 }
 @Override
 Date getExpiredDate() {
 return new Date();
}
}
