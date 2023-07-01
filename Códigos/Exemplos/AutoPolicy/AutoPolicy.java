//AutoPolicy.java
//Apólice de seguro.

public class AutoPolicy
{
    private int accountNumber; //Número da conta da apólice
    private String makeAndModel; //Marca e modelo do carro
    private String state; //Sigla do estado

    public AutoPolicy (int accountNumber, String makeAndModel, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber (int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setMakeAndModel (String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public boolean isNoFaultState()
    {
        boolean noFaultState;

        switch (this.state) //getState()
        {
            case "MA": case "NY": case "NJ": case "PE":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

} // Fim da classe AutoPolicy
