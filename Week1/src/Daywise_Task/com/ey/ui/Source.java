package com.ey.ui;

import com.ig.model.Activity;
import com.ig.exception.OperatorException;

public class Source {

    public static void main(String[] args) {
        Activity activity = new Activity("Hello", "Welcome", "+");  
        Source source = new Source();

        try {
            if (!source.validate(activity)) {
                throw new OperatorException("Invalid parameters");
            }

            String result = source.doOperation(activity);
            System.out.println("Result: " + result);

        } catch (OperatorException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Exception: One or more values are null!");
            e.printStackTrace();
        }
    }
    public boolean validate(Activity activity) throws OperatorException {
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("String1, String2, or Operator cannot be null");
        }

        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            throw new OperatorException("Invalid Operator! Allowed operators: + or -");
        }

        return true;
    }
    public String doOperation(Activity activity) {
        if (activity.getOperator().equals("+")) {
            return activity.getString1() + activity.getString2(); // Concatenation
        } else {
            return activity.getString1().replace(activity.getString2(), ""); // Remove substring
        }
    }
}