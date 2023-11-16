package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerCategoryDescriptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new PlannerCategoryDescriptions and sets the default values.
     */
    public PlannerCategoryDescriptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerCategoryDescriptions
     */
    @jakarta.annotation.Nonnull
    public static PlannerCategoryDescriptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerCategoryDescriptions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the category1 property value. The label associated with Category 1
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory1() {
        return this.backingStore.get("category1");
    }
    /**
     * Gets the category10 property value. The label associated with Category 10
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory10() {
        return this.backingStore.get("category10");
    }
    /**
     * Gets the category11 property value. The label associated with Category 11
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory11() {
        return this.backingStore.get("category11");
    }
    /**
     * Gets the category12 property value. The label associated with Category 12
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory12() {
        return this.backingStore.get("category12");
    }
    /**
     * Gets the category13 property value. The label associated with Category 13
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory13() {
        return this.backingStore.get("category13");
    }
    /**
     * Gets the category14 property value. The label associated with Category 14
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory14() {
        return this.backingStore.get("category14");
    }
    /**
     * Gets the category15 property value. The label associated with Category 15
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory15() {
        return this.backingStore.get("category15");
    }
    /**
     * Gets the category16 property value. The label associated with Category 16
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory16() {
        return this.backingStore.get("category16");
    }
    /**
     * Gets the category17 property value. The label associated with Category 17
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory17() {
        return this.backingStore.get("category17");
    }
    /**
     * Gets the category18 property value. The label associated with Category 18
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory18() {
        return this.backingStore.get("category18");
    }
    /**
     * Gets the category19 property value. The label associated with Category 19
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory19() {
        return this.backingStore.get("category19");
    }
    /**
     * Gets the category2 property value. The label associated with Category 2
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory2() {
        return this.backingStore.get("category2");
    }
    /**
     * Gets the category20 property value. The label associated with Category 20
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory20() {
        return this.backingStore.get("category20");
    }
    /**
     * Gets the category21 property value. The label associated with Category 21
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory21() {
        return this.backingStore.get("category21");
    }
    /**
     * Gets the category22 property value. The label associated with Category 22
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory22() {
        return this.backingStore.get("category22");
    }
    /**
     * Gets the category23 property value. The label associated with Category 23
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory23() {
        return this.backingStore.get("category23");
    }
    /**
     * Gets the category24 property value. The label associated with Category 24
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory24() {
        return this.backingStore.get("category24");
    }
    /**
     * Gets the category25 property value. The label associated with Category 25
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory25() {
        return this.backingStore.get("category25");
    }
    /**
     * Gets the category3 property value. The label associated with Category 3
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory3() {
        return this.backingStore.get("category3");
    }
    /**
     * Gets the category4 property value. The label associated with Category 4
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory4() {
        return this.backingStore.get("category4");
    }
    /**
     * Gets the category5 property value. The label associated with Category 5
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory5() {
        return this.backingStore.get("category5");
    }
    /**
     * Gets the category6 property value. The label associated with Category 6
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory6() {
        return this.backingStore.get("category6");
    }
    /**
     * Gets the category7 property value. The label associated with Category 7
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory7() {
        return this.backingStore.get("category7");
    }
    /**
     * Gets the category8 property value. The label associated with Category 8
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory8() {
        return this.backingStore.get("category8");
    }
    /**
     * Gets the category9 property value. The label associated with Category 9
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory9() {
        return this.backingStore.get("category9");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("category1", (n) -> { this.setCategory1(n.getStringValue()); });
        deserializerMap.put("category10", (n) -> { this.setCategory10(n.getStringValue()); });
        deserializerMap.put("category11", (n) -> { this.setCategory11(n.getStringValue()); });
        deserializerMap.put("category12", (n) -> { this.setCategory12(n.getStringValue()); });
        deserializerMap.put("category13", (n) -> { this.setCategory13(n.getStringValue()); });
        deserializerMap.put("category14", (n) -> { this.setCategory14(n.getStringValue()); });
        deserializerMap.put("category15", (n) -> { this.setCategory15(n.getStringValue()); });
        deserializerMap.put("category16", (n) -> { this.setCategory16(n.getStringValue()); });
        deserializerMap.put("category17", (n) -> { this.setCategory17(n.getStringValue()); });
        deserializerMap.put("category18", (n) -> { this.setCategory18(n.getStringValue()); });
        deserializerMap.put("category19", (n) -> { this.setCategory19(n.getStringValue()); });
        deserializerMap.put("category2", (n) -> { this.setCategory2(n.getStringValue()); });
        deserializerMap.put("category20", (n) -> { this.setCategory20(n.getStringValue()); });
        deserializerMap.put("category21", (n) -> { this.setCategory21(n.getStringValue()); });
        deserializerMap.put("category22", (n) -> { this.setCategory22(n.getStringValue()); });
        deserializerMap.put("category23", (n) -> { this.setCategory23(n.getStringValue()); });
        deserializerMap.put("category24", (n) -> { this.setCategory24(n.getStringValue()); });
        deserializerMap.put("category25", (n) -> { this.setCategory25(n.getStringValue()); });
        deserializerMap.put("category3", (n) -> { this.setCategory3(n.getStringValue()); });
        deserializerMap.put("category4", (n) -> { this.setCategory4(n.getStringValue()); });
        deserializerMap.put("category5", (n) -> { this.setCategory5(n.getStringValue()); });
        deserializerMap.put("category6", (n) -> { this.setCategory6(n.getStringValue()); });
        deserializerMap.put("category7", (n) -> { this.setCategory7(n.getStringValue()); });
        deserializerMap.put("category8", (n) -> { this.setCategory8(n.getStringValue()); });
        deserializerMap.put("category9", (n) -> { this.setCategory9(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the category1 property value. The label associated with Category 1
     * @param value Value to set for the category1 property.
     */
    public void setCategory1(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category1", value);
    }
    /**
     * Sets the category10 property value. The label associated with Category 10
     * @param value Value to set for the category10 property.
     */
    public void setCategory10(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category10", value);
    }
    /**
     * Sets the category11 property value. The label associated with Category 11
     * @param value Value to set for the category11 property.
     */
    public void setCategory11(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category11", value);
    }
    /**
     * Sets the category12 property value. The label associated with Category 12
     * @param value Value to set for the category12 property.
     */
    public void setCategory12(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category12", value);
    }
    /**
     * Sets the category13 property value. The label associated with Category 13
     * @param value Value to set for the category13 property.
     */
    public void setCategory13(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category13", value);
    }
    /**
     * Sets the category14 property value. The label associated with Category 14
     * @param value Value to set for the category14 property.
     */
    public void setCategory14(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category14", value);
    }
    /**
     * Sets the category15 property value. The label associated with Category 15
     * @param value Value to set for the category15 property.
     */
    public void setCategory15(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category15", value);
    }
    /**
     * Sets the category16 property value. The label associated with Category 16
     * @param value Value to set for the category16 property.
     */
    public void setCategory16(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category16", value);
    }
    /**
     * Sets the category17 property value. The label associated with Category 17
     * @param value Value to set for the category17 property.
     */
    public void setCategory17(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category17", value);
    }
    /**
     * Sets the category18 property value. The label associated with Category 18
     * @param value Value to set for the category18 property.
     */
    public void setCategory18(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category18", value);
    }
    /**
     * Sets the category19 property value. The label associated with Category 19
     * @param value Value to set for the category19 property.
     */
    public void setCategory19(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category19", value);
    }
    /**
     * Sets the category2 property value. The label associated with Category 2
     * @param value Value to set for the category2 property.
     */
    public void setCategory2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category2", value);
    }
    /**
     * Sets the category20 property value. The label associated with Category 20
     * @param value Value to set for the category20 property.
     */
    public void setCategory20(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category20", value);
    }
    /**
     * Sets the category21 property value. The label associated with Category 21
     * @param value Value to set for the category21 property.
     */
    public void setCategory21(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category21", value);
    }
    /**
     * Sets the category22 property value. The label associated with Category 22
     * @param value Value to set for the category22 property.
     */
    public void setCategory22(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category22", value);
    }
    /**
     * Sets the category23 property value. The label associated with Category 23
     * @param value Value to set for the category23 property.
     */
    public void setCategory23(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category23", value);
    }
    /**
     * Sets the category24 property value. The label associated with Category 24
     * @param value Value to set for the category24 property.
     */
    public void setCategory24(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category24", value);
    }
    /**
     * Sets the category25 property value. The label associated with Category 25
     * @param value Value to set for the category25 property.
     */
    public void setCategory25(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category25", value);
    }
    /**
     * Sets the category3 property value. The label associated with Category 3
     * @param value Value to set for the category3 property.
     */
    public void setCategory3(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category3", value);
    }
    /**
     * Sets the category4 property value. The label associated with Category 4
     * @param value Value to set for the category4 property.
     */
    public void setCategory4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category4", value);
    }
    /**
     * Sets the category5 property value. The label associated with Category 5
     * @param value Value to set for the category5 property.
     */
    public void setCategory5(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category5", value);
    }
    /**
     * Sets the category6 property value. The label associated with Category 6
     * @param value Value to set for the category6 property.
     */
    public void setCategory6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category6", value);
    }
    /**
     * Sets the category7 property value. The label associated with Category 7
     * @param value Value to set for the category7 property.
     */
    public void setCategory7(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category7", value);
    }
    /**
     * Sets the category8 property value. The label associated with Category 8
     * @param value Value to set for the category8 property.
     */
    public void setCategory8(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category8", value);
    }
    /**
     * Sets the category9 property value. The label associated with Category 9
     * @param value Value to set for the category9 property.
     */
    public void setCategory9(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category9", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
