package models;

public class Customer {
    private long customerId;
    private String customerName;
    private String customerEmail;
    private String username;
    private String password;
    private String cpf;
    static private long idSequence = 1;


    private Customer( String customerName, String customerEmail) {
        this.customerId = idSequence;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        idSequence++;
    }

    public long getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static final class CustomerBuilder {
        private long customerId;
        private String customerName;
        private String customerEmail;
        private String username;
        private String password;
        private String cpf;

        private CustomerBuilder() {
        }

        public static CustomerBuilder aCustomer() {
            return new CustomerBuilder();
        }

        public CustomerBuilder customerId(long customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerBuilder customerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public CustomerBuilder username(String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder password(String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer(customerName, customerEmail);
            customer.password = this.password;
            customer.cpf = this.cpf;
            customer.username = this.username;
            return customer;
        }
    }

    @Override
    public String toString() {
        return "Customer:" +
                "\ncustomerId=" + customerId +
                "\ncustomerName='" + customerName + '\'' +
                "\ncustomerEmail='" + customerEmail + '\'' +
                "\ncpf='" + cpf + '\'';
    }
}
