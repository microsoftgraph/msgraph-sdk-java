package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IdentityUserFlowAttributeInputType implements ValuedEnum {
    TextBox("textBox"),
    DateTimeDropdown("dateTimeDropdown"),
    RadioSingleSelect("radioSingleSelect"),
    DropdownSingleSelect("dropdownSingleSelect"),
    EmailBox("emailBox"),
    CheckboxMultiSelect("checkboxMultiSelect");
    public final String value;
    IdentityUserFlowAttributeInputType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IdentityUserFlowAttributeInputType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "textBox": return TextBox;
            case "dateTimeDropdown": return DateTimeDropdown;
            case "radioSingleSelect": return RadioSingleSelect;
            case "dropdownSingleSelect": return DropdownSingleSelect;
            case "emailBox": return EmailBox;
            case "checkboxMultiSelect": return CheckboxMultiSelect;
            default: return null;
        }
    }
}
