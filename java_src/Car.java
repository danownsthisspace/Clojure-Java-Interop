package car;

import com.google.gson.Gson;

public class Car {

  private String make;

  public Car(String make) {
    this.make = make;
  }

  public String drive() {
    return this.make + " goes vrooooom";
  }

  public static String staticFn() {
    return "This is from a static FN";
  }

  public String toJson() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
