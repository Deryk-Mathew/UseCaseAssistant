/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecaseassistant;

import java.util.ArrayList;

/**
 *
 * @author Deryk Mathew
 */
public class UseCaseObject extends UseCaseCreationPanel{

    public UseCaseObject() {
    }

    private void addData(){
        UCID = getUCID();
        UCtitle = getUCtitle();
        UCdesc = getUCdesc();
        priActor = getPriActor();
        secActor = getSecActor();
        precon = getPrecon();
        postcon = getPostcon();
        trigger = getTrigger();
        scenario = getScenario();
    }
    
    private int UCID;
    private String UCtitle;
    private String UCdesc;
    private String priActor;
    private String secActor;
    private String precon;
    private String postcon;
    private String trigger;
    private ArrayList<String> scenario = new ArrayList();

    
}

