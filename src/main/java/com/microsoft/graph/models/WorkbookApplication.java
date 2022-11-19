package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookApplication extends Entity implements Parsable {
    /** Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual. */
    private String _calculationMode;
    /**
     * Instantiates a new workbookApplication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookApplication() {
        super();
        this.setOdataType("#microsoft.graph.workbookApplication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookApplication
     */
    @javax.annotation.Nonnull
    public static WorkbookApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookApplication();
    }
    /**
     * Gets the calculationMode property value. Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCalculationMode() {
        return this._calculationMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookApplication currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("calculationMode", (n) -> { currentObject.setCalculationMode(n.getStringValue()); });
        return deserializerMap
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
        writer.writeStringValue("calculationMode", this.getCalculationMode());
    }
    /**
     * Sets the calculationMode property value. Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual.
     * @param value Value to set for the calculationMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalculationMode(@javax.annotation.Nullable final String value) {
        this._calculationMode = value;
    }
}
