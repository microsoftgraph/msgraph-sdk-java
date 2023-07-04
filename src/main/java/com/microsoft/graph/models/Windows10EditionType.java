package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows 10 Edition type.
 */
public enum Windows10EditionType implements ValuedEnum {
    /** Windows 10 Enterprise */
    Windows10Enterprise("windows10Enterprise"),
    /** Windows 10 EnterpriseN */
    Windows10EnterpriseN("windows10EnterpriseN"),
    /** Windows 10 Education */
    Windows10Education("windows10Education"),
    /** Windows 10 EducationN */
    Windows10EducationN("windows10EducationN"),
    /** Windows 10 Mobile Enterprise */
    Windows10MobileEnterprise("windows10MobileEnterprise"),
    /** Windows 10 Holographic Enterprise */
    Windows10HolographicEnterprise("windows10HolographicEnterprise"),
    /** Windows 10 Professional */
    Windows10Professional("windows10Professional"),
    /** Windows 10 ProfessionalN */
    Windows10ProfessionalN("windows10ProfessionalN"),
    /** Windows 10 Professional Education */
    Windows10ProfessionalEducation("windows10ProfessionalEducation"),
    /** Windows 10 Professional EducationN */
    Windows10ProfessionalEducationN("windows10ProfessionalEducationN"),
    /** Windows 10 Professional for Workstations */
    Windows10ProfessionalWorkstation("windows10ProfessionalWorkstation"),
    /** Windows 10 Professional for Workstations N */
    Windows10ProfessionalWorkstationN("windows10ProfessionalWorkstationN");
    public final String value;
    Windows10EditionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Windows10EditionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows10Enterprise": return Windows10Enterprise;
            case "windows10EnterpriseN": return Windows10EnterpriseN;
            case "windows10Education": return Windows10Education;
            case "windows10EducationN": return Windows10EducationN;
            case "windows10MobileEnterprise": return Windows10MobileEnterprise;
            case "windows10HolographicEnterprise": return Windows10HolographicEnterprise;
            case "windows10Professional": return Windows10Professional;
            case "windows10ProfessionalN": return Windows10ProfessionalN;
            case "windows10ProfessionalEducation": return Windows10ProfessionalEducation;
            case "windows10ProfessionalEducationN": return Windows10ProfessionalEducationN;
            case "windows10ProfessionalWorkstation": return Windows10ProfessionalWorkstation;
            case "windows10ProfessionalWorkstationN": return Windows10ProfessionalWorkstationN;
            default: return null;
        }
    }
}
