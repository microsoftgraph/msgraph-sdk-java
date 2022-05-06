package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesExtensionAttributes implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** First customizable extension attribute.  */
    private String _extensionAttribute1;
    /** Tenth customizable extension attribute.  */
    private String _extensionAttribute10;
    /** Eleventh customizable extension attribute.  */
    private String _extensionAttribute11;
    /** Twelfth customizable extension attribute.  */
    private String _extensionAttribute12;
    /** Thirteenth customizable extension attribute.  */
    private String _extensionAttribute13;
    /** Fourteenth customizable extension attribute.  */
    private String _extensionAttribute14;
    /** Fifteenth customizable extension attribute.  */
    private String _extensionAttribute15;
    /** Second customizable extension attribute.  */
    private String _extensionAttribute2;
    /** Third customizable extension attribute.  */
    private String _extensionAttribute3;
    /** Fourth customizable extension attribute.  */
    private String _extensionAttribute4;
    /** Fifth customizable extension attribute.  */
    private String _extensionAttribute5;
    /** Sixth customizable extension attribute.  */
    private String _extensionAttribute6;
    /** Seventh customizable extension attribute.  */
    private String _extensionAttribute7;
    /** Eighth customizable extension attribute.  */
    private String _extensionAttribute8;
    /** Ninth customizable extension attribute.  */
    private String _extensionAttribute9;
    /**
     * Instantiates a new onPremisesExtensionAttributes and sets the default values.
     * @return a void
     */
    public OnPremisesExtensionAttributes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesExtensionAttributes
     */
    @javax.annotation.Nonnull
    public static OnPremisesExtensionAttributes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesExtensionAttributes();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the extensionAttribute1 property value. First customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute1() {
        return this._extensionAttribute1;
    }
    /**
     * Gets the extensionAttribute10 property value. Tenth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute10() {
        return this._extensionAttribute10;
    }
    /**
     * Gets the extensionAttribute11 property value. Eleventh customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute11() {
        return this._extensionAttribute11;
    }
    /**
     * Gets the extensionAttribute12 property value. Twelfth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute12() {
        return this._extensionAttribute12;
    }
    /**
     * Gets the extensionAttribute13 property value. Thirteenth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute13() {
        return this._extensionAttribute13;
    }
    /**
     * Gets the extensionAttribute14 property value. Fourteenth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute14() {
        return this._extensionAttribute14;
    }
    /**
     * Gets the extensionAttribute15 property value. Fifteenth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute15() {
        return this._extensionAttribute15;
    }
    /**
     * Gets the extensionAttribute2 property value. Second customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute2() {
        return this._extensionAttribute2;
    }
    /**
     * Gets the extensionAttribute3 property value. Third customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute3() {
        return this._extensionAttribute3;
    }
    /**
     * Gets the extensionAttribute4 property value. Fourth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute4() {
        return this._extensionAttribute4;
    }
    /**
     * Gets the extensionAttribute5 property value. Fifth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute5() {
        return this._extensionAttribute5;
    }
    /**
     * Gets the extensionAttribute6 property value. Sixth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute6() {
        return this._extensionAttribute6;
    }
    /**
     * Gets the extensionAttribute7 property value. Seventh customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute7() {
        return this._extensionAttribute7;
    }
    /**
     * Gets the extensionAttribute8 property value. Eighth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute8() {
        return this._extensionAttribute8;
    }
    /**
     * Gets the extensionAttribute9 property value. Ninth customizable extension attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionAttribute9() {
        return this._extensionAttribute9;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesExtensionAttributes currentObject = this;
        return new HashMap<>(15) {{
            this.put("extensionAttribute1", (n) -> { currentObject.setExtensionAttribute1(n.getStringValue()); });
            this.put("extensionAttribute10", (n) -> { currentObject.setExtensionAttribute10(n.getStringValue()); });
            this.put("extensionAttribute11", (n) -> { currentObject.setExtensionAttribute11(n.getStringValue()); });
            this.put("extensionAttribute12", (n) -> { currentObject.setExtensionAttribute12(n.getStringValue()); });
            this.put("extensionAttribute13", (n) -> { currentObject.setExtensionAttribute13(n.getStringValue()); });
            this.put("extensionAttribute14", (n) -> { currentObject.setExtensionAttribute14(n.getStringValue()); });
            this.put("extensionAttribute15", (n) -> { currentObject.setExtensionAttribute15(n.getStringValue()); });
            this.put("extensionAttribute2", (n) -> { currentObject.setExtensionAttribute2(n.getStringValue()); });
            this.put("extensionAttribute3", (n) -> { currentObject.setExtensionAttribute3(n.getStringValue()); });
            this.put("extensionAttribute4", (n) -> { currentObject.setExtensionAttribute4(n.getStringValue()); });
            this.put("extensionAttribute5", (n) -> { currentObject.setExtensionAttribute5(n.getStringValue()); });
            this.put("extensionAttribute6", (n) -> { currentObject.setExtensionAttribute6(n.getStringValue()); });
            this.put("extensionAttribute7", (n) -> { currentObject.setExtensionAttribute7(n.getStringValue()); });
            this.put("extensionAttribute8", (n) -> { currentObject.setExtensionAttribute8(n.getStringValue()); });
            this.put("extensionAttribute9", (n) -> { currentObject.setExtensionAttribute9(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("extensionAttribute1", this.getExtensionAttribute1());
        writer.writeStringValue("extensionAttribute10", this.getExtensionAttribute10());
        writer.writeStringValue("extensionAttribute11", this.getExtensionAttribute11());
        writer.writeStringValue("extensionAttribute12", this.getExtensionAttribute12());
        writer.writeStringValue("extensionAttribute13", this.getExtensionAttribute13());
        writer.writeStringValue("extensionAttribute14", this.getExtensionAttribute14());
        writer.writeStringValue("extensionAttribute15", this.getExtensionAttribute15());
        writer.writeStringValue("extensionAttribute2", this.getExtensionAttribute2());
        writer.writeStringValue("extensionAttribute3", this.getExtensionAttribute3());
        writer.writeStringValue("extensionAttribute4", this.getExtensionAttribute4());
        writer.writeStringValue("extensionAttribute5", this.getExtensionAttribute5());
        writer.writeStringValue("extensionAttribute6", this.getExtensionAttribute6());
        writer.writeStringValue("extensionAttribute7", this.getExtensionAttribute7());
        writer.writeStringValue("extensionAttribute8", this.getExtensionAttribute8());
        writer.writeStringValue("extensionAttribute9", this.getExtensionAttribute9());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the extensionAttribute1 property value. First customizable extension attribute.
     * @param value Value to set for the extensionAttribute1 property.
     * @return a void
     */
    public void setExtensionAttribute1(@javax.annotation.Nullable final String value) {
        this._extensionAttribute1 = value;
    }
    /**
     * Sets the extensionAttribute10 property value. Tenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute10 property.
     * @return a void
     */
    public void setExtensionAttribute10(@javax.annotation.Nullable final String value) {
        this._extensionAttribute10 = value;
    }
    /**
     * Sets the extensionAttribute11 property value. Eleventh customizable extension attribute.
     * @param value Value to set for the extensionAttribute11 property.
     * @return a void
     */
    public void setExtensionAttribute11(@javax.annotation.Nullable final String value) {
        this._extensionAttribute11 = value;
    }
    /**
     * Sets the extensionAttribute12 property value. Twelfth customizable extension attribute.
     * @param value Value to set for the extensionAttribute12 property.
     * @return a void
     */
    public void setExtensionAttribute12(@javax.annotation.Nullable final String value) {
        this._extensionAttribute12 = value;
    }
    /**
     * Sets the extensionAttribute13 property value. Thirteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute13 property.
     * @return a void
     */
    public void setExtensionAttribute13(@javax.annotation.Nullable final String value) {
        this._extensionAttribute13 = value;
    }
    /**
     * Sets the extensionAttribute14 property value. Fourteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute14 property.
     * @return a void
     */
    public void setExtensionAttribute14(@javax.annotation.Nullable final String value) {
        this._extensionAttribute14 = value;
    }
    /**
     * Sets the extensionAttribute15 property value. Fifteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute15 property.
     * @return a void
     */
    public void setExtensionAttribute15(@javax.annotation.Nullable final String value) {
        this._extensionAttribute15 = value;
    }
    /**
     * Sets the extensionAttribute2 property value. Second customizable extension attribute.
     * @param value Value to set for the extensionAttribute2 property.
     * @return a void
     */
    public void setExtensionAttribute2(@javax.annotation.Nullable final String value) {
        this._extensionAttribute2 = value;
    }
    /**
     * Sets the extensionAttribute3 property value. Third customizable extension attribute.
     * @param value Value to set for the extensionAttribute3 property.
     * @return a void
     */
    public void setExtensionAttribute3(@javax.annotation.Nullable final String value) {
        this._extensionAttribute3 = value;
    }
    /**
     * Sets the extensionAttribute4 property value. Fourth customizable extension attribute.
     * @param value Value to set for the extensionAttribute4 property.
     * @return a void
     */
    public void setExtensionAttribute4(@javax.annotation.Nullable final String value) {
        this._extensionAttribute4 = value;
    }
    /**
     * Sets the extensionAttribute5 property value. Fifth customizable extension attribute.
     * @param value Value to set for the extensionAttribute5 property.
     * @return a void
     */
    public void setExtensionAttribute5(@javax.annotation.Nullable final String value) {
        this._extensionAttribute5 = value;
    }
    /**
     * Sets the extensionAttribute6 property value. Sixth customizable extension attribute.
     * @param value Value to set for the extensionAttribute6 property.
     * @return a void
     */
    public void setExtensionAttribute6(@javax.annotation.Nullable final String value) {
        this._extensionAttribute6 = value;
    }
    /**
     * Sets the extensionAttribute7 property value. Seventh customizable extension attribute.
     * @param value Value to set for the extensionAttribute7 property.
     * @return a void
     */
    public void setExtensionAttribute7(@javax.annotation.Nullable final String value) {
        this._extensionAttribute7 = value;
    }
    /**
     * Sets the extensionAttribute8 property value. Eighth customizable extension attribute.
     * @param value Value to set for the extensionAttribute8 property.
     * @return a void
     */
    public void setExtensionAttribute8(@javax.annotation.Nullable final String value) {
        this._extensionAttribute8 = value;
    }
    /**
     * Sets the extensionAttribute9 property value. Ninth customizable extension attribute.
     * @param value Value to set for the extensionAttribute9 property.
     * @return a void
     */
    public void setExtensionAttribute9(@javax.annotation.Nullable final String value) {
        this._extensionAttribute9 = value;
    }
}
