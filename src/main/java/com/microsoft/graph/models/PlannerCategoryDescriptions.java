package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerCategoryDescriptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The label associated with Category 1 */
    private String _category1;
    /** The label associated with Category 10 */
    private String _category10;
    /** The label associated with Category 11 */
    private String _category11;
    /** The label associated with Category 12 */
    private String _category12;
    /** The label associated with Category 13 */
    private String _category13;
    /** The label associated with Category 14 */
    private String _category14;
    /** The label associated with Category 15 */
    private String _category15;
    /** The label associated with Category 16 */
    private String _category16;
    /** The label associated with Category 17 */
    private String _category17;
    /** The label associated with Category 18 */
    private String _category18;
    /** The label associated with Category 19 */
    private String _category19;
    /** The label associated with Category 2 */
    private String _category2;
    /** The label associated with Category 20 */
    private String _category20;
    /** The label associated with Category 21 */
    private String _category21;
    /** The label associated with Category 22 */
    private String _category22;
    /** The label associated with Category 23 */
    private String _category23;
    /** The label associated with Category 24 */
    private String _category24;
    /** The label associated with Category 25 */
    private String _category25;
    /** The label associated with Category 3 */
    private String _category3;
    /** The label associated with Category 4 */
    private String _category4;
    /** The label associated with Category 5 */
    private String _category5;
    /** The label associated with Category 6 */
    private String _category6;
    /** The label associated with Category 7 */
    private String _category7;
    /** The label associated with Category 8 */
    private String _category8;
    /** The label associated with Category 9 */
    private String _category9;
    /**
     * Instantiates a new plannerCategoryDescriptions and sets the default values.
     * @return a void
     */
    public PlannerCategoryDescriptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerCategoryDescriptions
     */
    @javax.annotation.Nonnull
    public static PlannerCategoryDescriptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerCategoryDescriptions();
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
     * Gets the category1 property value. The label associated with Category 1
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory1() {
        return this._category1;
    }
    /**
     * Gets the category10 property value. The label associated with Category 10
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory10() {
        return this._category10;
    }
    /**
     * Gets the category11 property value. The label associated with Category 11
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory11() {
        return this._category11;
    }
    /**
     * Gets the category12 property value. The label associated with Category 12
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory12() {
        return this._category12;
    }
    /**
     * Gets the category13 property value. The label associated with Category 13
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory13() {
        return this._category13;
    }
    /**
     * Gets the category14 property value. The label associated with Category 14
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory14() {
        return this._category14;
    }
    /**
     * Gets the category15 property value. The label associated with Category 15
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory15() {
        return this._category15;
    }
    /**
     * Gets the category16 property value. The label associated with Category 16
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory16() {
        return this._category16;
    }
    /**
     * Gets the category17 property value. The label associated with Category 17
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory17() {
        return this._category17;
    }
    /**
     * Gets the category18 property value. The label associated with Category 18
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory18() {
        return this._category18;
    }
    /**
     * Gets the category19 property value. The label associated with Category 19
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory19() {
        return this._category19;
    }
    /**
     * Gets the category2 property value. The label associated with Category 2
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory2() {
        return this._category2;
    }
    /**
     * Gets the category20 property value. The label associated with Category 20
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory20() {
        return this._category20;
    }
    /**
     * Gets the category21 property value. The label associated with Category 21
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory21() {
        return this._category21;
    }
    /**
     * Gets the category22 property value. The label associated with Category 22
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory22() {
        return this._category22;
    }
    /**
     * Gets the category23 property value. The label associated with Category 23
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory23() {
        return this._category23;
    }
    /**
     * Gets the category24 property value. The label associated with Category 24
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory24() {
        return this._category24;
    }
    /**
     * Gets the category25 property value. The label associated with Category 25
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory25() {
        return this._category25;
    }
    /**
     * Gets the category3 property value. The label associated with Category 3
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory3() {
        return this._category3;
    }
    /**
     * Gets the category4 property value. The label associated with Category 4
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory4() {
        return this._category4;
    }
    /**
     * Gets the category5 property value. The label associated with Category 5
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory5() {
        return this._category5;
    }
    /**
     * Gets the category6 property value. The label associated with Category 6
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory6() {
        return this._category6;
    }
    /**
     * Gets the category7 property value. The label associated with Category 7
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory7() {
        return this._category7;
    }
    /**
     * Gets the category8 property value. The label associated with Category 8
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory8() {
        return this._category8;
    }
    /**
     * Gets the category9 property value. The label associated with Category 9
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory9() {
        return this._category9;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerCategoryDescriptions currentObject = this;
        return new HashMap<>(25) {{
            this.put("category1", (n) -> { currentObject.setCategory1(n.getStringValue()); });
            this.put("category10", (n) -> { currentObject.setCategory10(n.getStringValue()); });
            this.put("category11", (n) -> { currentObject.setCategory11(n.getStringValue()); });
            this.put("category12", (n) -> { currentObject.setCategory12(n.getStringValue()); });
            this.put("category13", (n) -> { currentObject.setCategory13(n.getStringValue()); });
            this.put("category14", (n) -> { currentObject.setCategory14(n.getStringValue()); });
            this.put("category15", (n) -> { currentObject.setCategory15(n.getStringValue()); });
            this.put("category16", (n) -> { currentObject.setCategory16(n.getStringValue()); });
            this.put("category17", (n) -> { currentObject.setCategory17(n.getStringValue()); });
            this.put("category18", (n) -> { currentObject.setCategory18(n.getStringValue()); });
            this.put("category19", (n) -> { currentObject.setCategory19(n.getStringValue()); });
            this.put("category2", (n) -> { currentObject.setCategory2(n.getStringValue()); });
            this.put("category20", (n) -> { currentObject.setCategory20(n.getStringValue()); });
            this.put("category21", (n) -> { currentObject.setCategory21(n.getStringValue()); });
            this.put("category22", (n) -> { currentObject.setCategory22(n.getStringValue()); });
            this.put("category23", (n) -> { currentObject.setCategory23(n.getStringValue()); });
            this.put("category24", (n) -> { currentObject.setCategory24(n.getStringValue()); });
            this.put("category25", (n) -> { currentObject.setCategory25(n.getStringValue()); });
            this.put("category3", (n) -> { currentObject.setCategory3(n.getStringValue()); });
            this.put("category4", (n) -> { currentObject.setCategory4(n.getStringValue()); });
            this.put("category5", (n) -> { currentObject.setCategory5(n.getStringValue()); });
            this.put("category6", (n) -> { currentObject.setCategory6(n.getStringValue()); });
            this.put("category7", (n) -> { currentObject.setCategory7(n.getStringValue()); });
            this.put("category8", (n) -> { currentObject.setCategory8(n.getStringValue()); });
            this.put("category9", (n) -> { currentObject.setCategory9(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category1", this.getCategory1());
        writer.writeStringValue("category10", this.getCategory10());
        writer.writeStringValue("category11", this.getCategory11());
        writer.writeStringValue("category12", this.getCategory12());
        writer.writeStringValue("category13", this.getCategory13());
        writer.writeStringValue("category14", this.getCategory14());
        writer.writeStringValue("category15", this.getCategory15());
        writer.writeStringValue("category16", this.getCategory16());
        writer.writeStringValue("category17", this.getCategory17());
        writer.writeStringValue("category18", this.getCategory18());
        writer.writeStringValue("category19", this.getCategory19());
        writer.writeStringValue("category2", this.getCategory2());
        writer.writeStringValue("category20", this.getCategory20());
        writer.writeStringValue("category21", this.getCategory21());
        writer.writeStringValue("category22", this.getCategory22());
        writer.writeStringValue("category23", this.getCategory23());
        writer.writeStringValue("category24", this.getCategory24());
        writer.writeStringValue("category25", this.getCategory25());
        writer.writeStringValue("category3", this.getCategory3());
        writer.writeStringValue("category4", this.getCategory4());
        writer.writeStringValue("category5", this.getCategory5());
        writer.writeStringValue("category6", this.getCategory6());
        writer.writeStringValue("category7", this.getCategory7());
        writer.writeStringValue("category8", this.getCategory8());
        writer.writeStringValue("category9", this.getCategory9());
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
     * Sets the category1 property value. The label associated with Category 1
     * @param value Value to set for the category1 property.
     * @return a void
     */
    public void setCategory1(@javax.annotation.Nullable final String value) {
        this._category1 = value;
    }
    /**
     * Sets the category10 property value. The label associated with Category 10
     * @param value Value to set for the category10 property.
     * @return a void
     */
    public void setCategory10(@javax.annotation.Nullable final String value) {
        this._category10 = value;
    }
    /**
     * Sets the category11 property value. The label associated with Category 11
     * @param value Value to set for the category11 property.
     * @return a void
     */
    public void setCategory11(@javax.annotation.Nullable final String value) {
        this._category11 = value;
    }
    /**
     * Sets the category12 property value. The label associated with Category 12
     * @param value Value to set for the category12 property.
     * @return a void
     */
    public void setCategory12(@javax.annotation.Nullable final String value) {
        this._category12 = value;
    }
    /**
     * Sets the category13 property value. The label associated with Category 13
     * @param value Value to set for the category13 property.
     * @return a void
     */
    public void setCategory13(@javax.annotation.Nullable final String value) {
        this._category13 = value;
    }
    /**
     * Sets the category14 property value. The label associated with Category 14
     * @param value Value to set for the category14 property.
     * @return a void
     */
    public void setCategory14(@javax.annotation.Nullable final String value) {
        this._category14 = value;
    }
    /**
     * Sets the category15 property value. The label associated with Category 15
     * @param value Value to set for the category15 property.
     * @return a void
     */
    public void setCategory15(@javax.annotation.Nullable final String value) {
        this._category15 = value;
    }
    /**
     * Sets the category16 property value. The label associated with Category 16
     * @param value Value to set for the category16 property.
     * @return a void
     */
    public void setCategory16(@javax.annotation.Nullable final String value) {
        this._category16 = value;
    }
    /**
     * Sets the category17 property value. The label associated with Category 17
     * @param value Value to set for the category17 property.
     * @return a void
     */
    public void setCategory17(@javax.annotation.Nullable final String value) {
        this._category17 = value;
    }
    /**
     * Sets the category18 property value. The label associated with Category 18
     * @param value Value to set for the category18 property.
     * @return a void
     */
    public void setCategory18(@javax.annotation.Nullable final String value) {
        this._category18 = value;
    }
    /**
     * Sets the category19 property value. The label associated with Category 19
     * @param value Value to set for the category19 property.
     * @return a void
     */
    public void setCategory19(@javax.annotation.Nullable final String value) {
        this._category19 = value;
    }
    /**
     * Sets the category2 property value. The label associated with Category 2
     * @param value Value to set for the category2 property.
     * @return a void
     */
    public void setCategory2(@javax.annotation.Nullable final String value) {
        this._category2 = value;
    }
    /**
     * Sets the category20 property value. The label associated with Category 20
     * @param value Value to set for the category20 property.
     * @return a void
     */
    public void setCategory20(@javax.annotation.Nullable final String value) {
        this._category20 = value;
    }
    /**
     * Sets the category21 property value. The label associated with Category 21
     * @param value Value to set for the category21 property.
     * @return a void
     */
    public void setCategory21(@javax.annotation.Nullable final String value) {
        this._category21 = value;
    }
    /**
     * Sets the category22 property value. The label associated with Category 22
     * @param value Value to set for the category22 property.
     * @return a void
     */
    public void setCategory22(@javax.annotation.Nullable final String value) {
        this._category22 = value;
    }
    /**
     * Sets the category23 property value. The label associated with Category 23
     * @param value Value to set for the category23 property.
     * @return a void
     */
    public void setCategory23(@javax.annotation.Nullable final String value) {
        this._category23 = value;
    }
    /**
     * Sets the category24 property value. The label associated with Category 24
     * @param value Value to set for the category24 property.
     * @return a void
     */
    public void setCategory24(@javax.annotation.Nullable final String value) {
        this._category24 = value;
    }
    /**
     * Sets the category25 property value. The label associated with Category 25
     * @param value Value to set for the category25 property.
     * @return a void
     */
    public void setCategory25(@javax.annotation.Nullable final String value) {
        this._category25 = value;
    }
    /**
     * Sets the category3 property value. The label associated with Category 3
     * @param value Value to set for the category3 property.
     * @return a void
     */
    public void setCategory3(@javax.annotation.Nullable final String value) {
        this._category3 = value;
    }
    /**
     * Sets the category4 property value. The label associated with Category 4
     * @param value Value to set for the category4 property.
     * @return a void
     */
    public void setCategory4(@javax.annotation.Nullable final String value) {
        this._category4 = value;
    }
    /**
     * Sets the category5 property value. The label associated with Category 5
     * @param value Value to set for the category5 property.
     * @return a void
     */
    public void setCategory5(@javax.annotation.Nullable final String value) {
        this._category5 = value;
    }
    /**
     * Sets the category6 property value. The label associated with Category 6
     * @param value Value to set for the category6 property.
     * @return a void
     */
    public void setCategory6(@javax.annotation.Nullable final String value) {
        this._category6 = value;
    }
    /**
     * Sets the category7 property value. The label associated with Category 7
     * @param value Value to set for the category7 property.
     * @return a void
     */
    public void setCategory7(@javax.annotation.Nullable final String value) {
        this._category7 = value;
    }
    /**
     * Sets the category8 property value. The label associated with Category 8
     * @param value Value to set for the category8 property.
     * @return a void
     */
    public void setCategory8(@javax.annotation.Nullable final String value) {
        this._category8 = value;
    }
    /**
     * Sets the category9 property value. The label associated with Category 9
     * @param value Value to set for the category9 property.
     * @return a void
     */
    public void setCategory9(@javax.annotation.Nullable final String value) {
        this._category9 = value;
    }
}
