package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WorkflowTriggerTimeBasedAttribute implements ValuedEnum {
    EmployeeHireDate("employeeHireDate"),
    EmployeeLeaveDateTime("employeeLeaveDateTime"),
    UnknownFutureValue("unknownFutureValue"),
    CreatedDateTime("createdDateTime");
    public final String value;
    WorkflowTriggerTimeBasedAttribute(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WorkflowTriggerTimeBasedAttribute forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "employeeHireDate": return EmployeeHireDate;
            case "employeeLeaveDateTime": return EmployeeLeaveDateTime;
            case "unknownFutureValue": return UnknownFutureValue;
            case "createdDateTime": return CreatedDateTime;
            default: return null;
        }
    }
}
