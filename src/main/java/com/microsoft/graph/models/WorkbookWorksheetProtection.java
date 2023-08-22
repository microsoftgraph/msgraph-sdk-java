package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookWorksheetProtection extends Entity implements Parsable {
    /**
     * Sheet protection options. Read-only.
     */
    private WorkbookWorksheetProtectionOptions options;
    /**
     * Indicates if the worksheet is protected.  Read-only.
     */
    private Boolean protectedEscaped;
    /**
     * Instantiates a new workbookWorksheetProtection and sets the default values.
     */
    public WorkbookWorksheetProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookWorksheetProtection
     */
    @jakarta.annotation.Nonnull
    public static WorkbookWorksheetProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookWorksheetProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("options", (n) -> { this.setOptions(n.getObjectValue(WorkbookWorksheetProtectionOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("protected", (n) -> { this.setProtected(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. Sheet protection options. Read-only.
     * @return a workbookWorksheetProtectionOptions
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheetProtectionOptions getOptions() {
        return this.options;
    }
    /**
     * Gets the protected property value. Indicates if the worksheet is protected.  Read-only.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProtected() {
        return this.protectedEscaped;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("options", this.getOptions());
        writer.writeBooleanValue("protected", this.getProtected());
    }
    /**
     * Sets the options property value. Sheet protection options. Read-only.
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final WorkbookWorksheetProtectionOptions value) {
        this.options = value;
    }
    /**
     * Sets the protected property value. Indicates if the worksheet is protected.  Read-only.
     * @param value Value to set for the protected property.
     */
    public void setProtected(@jakarta.annotation.Nullable final Boolean value) {
        this.protectedEscaped = value;
    }
}
