package Day5;

class StackFullException extends Exception {
    public StackFullException(String message) { super(message); }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) { super(message); }
}

class InvalidContactException extends Exception {
    public InvalidContactException(String message) { super(message); }
}

public class ContactStack {
    private Contact[] stack;
    private int top;
    private int capacity;

    public ContactStack(int size) {
        this.capacity = size;
        this.stack = new Contact[size];
        this.top = -1;  
    }
    public void push(Contact contact) throws StackFullException, InvalidContactException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full! Cannot push new Contact.");
        }
        if (!contact.isValid()) {
            throw new InvalidContactException("Invalid Contact! Please provide correct details.");
        }
        stack[++top] = contact;
        System.out.println("Contact added successfully!");
    }

    public Contact pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty! Cannot pop.");
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("\nContacts in Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}