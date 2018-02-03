package sda.cards.cardvalidation;

public class ValidationResult {
    private String issuer;
    private boolean luhnPassed = false;

    public String getIssuer() {
        return issuer;
    }

    void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public boolean isLuhnPassed() {
        return luhnPassed;
    }

    void setLuhnPassed(boolean luhnPassed) {
        this.luhnPassed = luhnPassed;
    }
}
