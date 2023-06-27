package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFormatProtection extends Entity implements Parsable {
    /**
     * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
     */
    private Boolean formulaHidden;
    /**
     * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
     */
    private Boolean locked;
    /**
     * Instantiates a new WorkbookFormatProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookFormatProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookFormatProtection
     */
    @javax.annotation.Nonnull
    public static WorkbookFormatProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFormatProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("formulaHidden", (n) -> { this.setFormulaHidden(n.getBooleanValue()); });
        deserializerMap.put("locked", (n) -> { this.setLocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formulaHidden property value. Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFormulaHidden() {
        return this.formulaHidden;
    }
    /**
     * Gets the locked property value. Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("formulaHidden", this.getFormulaHidden());
        writer.writeBooleanValue("locked", this.getLocked());
    }
    /**
     * Sets the formulaHidden property value. Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
     * @param value Value to set for the formulaHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormulaHidden(@javax.annotation.Nullable final Boolean value) {
        this.formulaHidden = value;
    }
    /**
     * Sets the locked property value. Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
     * @param value Value to set for the locked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocked(@javax.annotation.Nullable final Boolean value) {
        this.locked = value;
    }
}
