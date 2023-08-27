/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class RelevantRegulations implements Serializable{
    private String regulationId;
    private String title;
    private String text;
    private Date dateAdded;
    private String complianceStatus;
    private Date lastUpdatedDate;

    public RelevantRegulations(String regulationId, String title, String text, Date dateAdded, String complianceStatus, Date lastUpdatedDate) {
        this.regulationId = regulationId;
        this.title = title;
        this.text = text;
        this.dateAdded = dateAdded;
        this.complianceStatus = complianceStatus;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(String regulationId) {
        this.regulationId = regulationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

  
    
}
