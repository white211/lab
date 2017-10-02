package cn.white.test.facade;


import cn.white.test.facade.subsystem.IFacade;

public class AccountManager {
    AccountManager() {
    }

    public void validate(String accName, String accPass, String addr, String creditInfo) {

    }

    public void save(String accName, String accPass, String addr, String creditInfo) {
        IFacade facacde = getFacade();
        facacde.saveCustomerData(accName, accPass, addr, creditInfo);
    }

    private IFacade getFacade() {
        try {
            return (IFacade) Class.forName("cn.white.ppt.facade.subsystem.CustomerFacade").newInstance();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}





