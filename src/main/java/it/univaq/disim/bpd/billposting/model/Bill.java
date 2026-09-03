package it.univaq.disim.bpd.billposting.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "accountHolder",
        "invoiceNumber",
        "amountDue"
})

public class Bill {

    @JsonProperty("accountHolder")
    private String accountHolder;
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    @JsonProperty("amountDue")
    private Float amountDue;

    public Bill() {
    }

    public Bill(String accountHolder, String invoiceNumber, Float amountDue) {
        super();
        this.accountHolder = accountHolder;
        this.invoiceNumber = invoiceNumber;
        this.amountDue = amountDue;
    }

    @JsonProperty("accountHolder")
    public String getAccountHolder() {
        return accountHolder;
    }

    @JsonProperty("accountHolder")
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @JsonProperty("amountDue")
    public Float getAmountDue() {
        return amountDue;
    }

    @JsonProperty("amountDue")
    public void setAmountDue(Float amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bill.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountHolder");
        sb.append('=');
        sb.append(((this.accountHolder == null)?"<null>":this.accountHolder));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.amountDue == null)? 0 :this.amountDue.hashCode()));
        result = ((result* 31)+((this.accountHolder == null)? 0 :this.accountHolder.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bill) == false) {
            return false;
        }
        Bill rhs = ((Bill) other);
        return ((((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber)))&&((this.amountDue == rhs.amountDue)||((this.amountDue!= null)&&this.amountDue.equals(rhs.amountDue))))&&((this.accountHolder == rhs.accountHolder)||((this.accountHolder!= null)&&this.accountHolder.equals(rhs.accountHolder))));
    }
}