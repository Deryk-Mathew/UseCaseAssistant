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
public class UseCaseObject extends UseCaseCreationPanel {

    public UseCaseObject() {
    }

    private void addData() {
        setUCID(getUCID());
        setUCtitle(getTitleField());
        setUCdesc(getDescField());
        setPriActor(getPriActorField());
        setSecActor(getSecActorField());
        setPrecon(getPreconField());
        setPostcon(getPostField());
        setTrigger(getTriggerField());
        setScenario(getScenario());
    }
    
    private void checkData(){}
    
    private void submitPressed(){
        addData();
        checkData();
    }

    public int getUCID() {
        return UCID;
    }

    public void setUCID(int UCID) {
        this.UCID = UCID;
    }

    public String getUCtitle() {
        return UCtitle;
    }

    public void setUCtitle(String UCtitle) {
        this.UCtitle = UCtitle;
    }

    public String getUCdesc() {
        return UCdesc;
    }

    public void setUCdesc(String UCdesc) {
        this.UCdesc = UCdesc;
    }

    public String getPriActor() {
        return priActor;
    }

    public void setPriActor(String priActor) {
        this.priActor = priActor;
    }

    public String getSecActor() {
        return secActor;
    }

    public void setSecActor(String secActor) {
        this.secActor = secActor;
    }

    public String getPrecon() {
        return precon;
    }

    public void setPrecon(String precon) {
        this.precon = precon;
    }

    public String getPostcon() {
        return postcon;
    }

    public void setPostcon(String postcon) {
        this.postcon = postcon;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public ArrayList<String> getScenario() {
        return scenario;
    }

    public void setScenario(ArrayList<String> scenario) {
        this.scenario = scenario;
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
