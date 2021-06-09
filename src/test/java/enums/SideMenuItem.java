package enums;

public enum SideMenuItem {

    STATUS("tvUserStatus"),
    SELL("rlSell"),
    BUY("rlBuy"),
    MYBASKET("rlBasket"),
    MYITEMS("rlItems"),
    BUERSREQUEST("rlBuyers"),
    SEARCHUSERS("rlSearch"),
    BLOCKED("rlBlocked"),
    FAVORITES("rlFavorites"),
    SETTINGS("rlSettings"),
    FAQ("rlFAQ"),
    TECHSUPPORT("rlSupport"),
    TERMSOFSERVICE("rlTerms");

    private String locator;

    SideMenuItem(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
