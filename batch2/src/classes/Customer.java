package classes;

/**
 * Created by JPMPC-B216 on 11/10/2016.
 */
public class Customer extends Person{
    private float CustomerID;
    private String MembershipLevel;
    private float CreditCardNo;

    public float getCustomerID() {
        return CustomerID;
    }

    public String getMembershipLevel() {
        return MembershipLevel;
    }

    public float getCreditCardNo() {
        return CreditCardNo;
    }

    public void setCustomerID(float customerID) {
        CustomerID = customerID;
    }

    public void setMembershipLevel(String membershipLevel) {
        MembershipLevel = membershipLevel;
    }

    public void setCreditCardNo(float creditCardNo) {
        CreditCardNo = creditCardNo;
    }
}
