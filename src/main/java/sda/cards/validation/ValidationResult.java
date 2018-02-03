package sda.cards.validation;

public class ValidationResult {
    private String issuer;
    private boolean luhnPassed = false;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public boolean isLuhnPassed() {
        return luhnPassed;
    }

    public void setLuhnPassed(boolean luhnPassed) {
        this.luhnPassed = luhnPassed;
    }
}
