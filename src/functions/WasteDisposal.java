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
public class WasteDisposal {
    private Date dateOfDisposal;
    private String wasteType;
    private double quantity;
    private String locationOfDisposal;
    private String disposersName;
    private String disposalDocumentation;
    private String regulatoryCompliance;

    public WasteDisposal(Date dateOfDisposal, String wasteType, double quantity,
            String locationOfDisposal, String disposersName, String disposalDocumentation, 
            String regulatoryCompliance) {
        this.dateOfDisposal = dateOfDisposal;
        this.wasteType = wasteType;
        this.quantity = quantity;
        this.locationOfDisposal = locationOfDisposal;
        this.disposersName = disposersName;
        this.disposalDocumentation = disposalDocumentation;
        this.regulatoryCompliance = regulatoryCompliance;
    }

    public Date getDateOfDisposal() {
        return dateOfDisposal;
    }

    public void setDateOfDisposal(Date dateOfDisposal) {
        this.dateOfDisposal = dateOfDisposal;
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getLocationOfDisposal() {
        return locationOfDisposal;
    }

    public void setLocationOfDisposal(String locationOfDisposal) {
        this.locationOfDisposal = locationOfDisposal;
    }

    public String getDisposersName() {
        return disposersName;
    }

    public void setDisposersName(String disposersName) {
        this.disposersName = disposersName;
    }

    public String getDisposalDocumentation() {
        return disposalDocumentation;
    }

    public void setDisposalDocumentation(String disposalDocumentation) {
        this.disposalDocumentation = disposalDocumentation;
    }

    public String getRegulatoryCompliance() {
        return regulatoryCompliance;
    }

    public void setRegulatoryCompliance(String regulatoryCompliance) {
        this.regulatoryCompliance = regulatoryCompliance;
    }
    
    
    
}
