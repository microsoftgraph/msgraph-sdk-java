package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Filter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     */
    private java.util.List<FilterGroup> categoryFilterGroups;
    /**
     * Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     */
    private java.util.List<FilterGroup> groups;
    /**
     * *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     */
    private java.util.List<FilterGroup> inputFilterGroups;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new Filter and sets the default values.
     */
    public Filter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Filter
     */
    @jakarta.annotation.Nonnull
    public static Filter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Filter();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the categoryFilterGroups property value. *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a java.util.List<FilterGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilterGroup> getCategoryFilterGroups() {
        return this.categoryFilterGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("categoryFilterGroups", (n) -> { this.setCategoryFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("inputFilterGroups", (n) -> { this.setInputFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a java.util.List<FilterGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilterGroup> getGroups() {
        return this.groups;
    }
    /**
     * Gets the inputFilterGroups property value. *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @return a java.util.List<FilterGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilterGroup> getInputFilterGroups() {
        return this.inputFilterGroups;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryFilterGroups", this.getCategoryFilterGroups());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfObjectValues("inputFilterGroups", this.getInputFilterGroups());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the categoryFilterGroups property value. *Experimental* Filter group set used to decide whether given object belongs and should be processed as part of this object mapping. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the categoryFilterGroups property.
     */
    public void setCategoryFilterGroups(@jakarta.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.categoryFilterGroups = value;
    }
    /**
     * Sets the groups property value. Filter group set used to decide whether given object is in scope for provisioning. This is the filter which should be used in most cases. If an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is not satisfied any longer, such object will get de-provisioned'. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.groups = value;
    }
    /**
     * Sets the inputFilterGroups property value. *Experimental* Filter group set used to filter out objects at the early stage of reading them from the directory. If an object doesn't satisfy this filter it will not be processed further. Important to understand is that if an object used to satisfy this filter at a given moment, and then the object or the filter was changed so that filter is no longer satisfied, such object will NOT get de-provisioned. An object is considered in scope if ANY of the groups in the collection is evaluated to true.
     * @param value Value to set for the inputFilterGroups property.
     */
    public void setInputFilterGroups(@jakarta.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.inputFilterGroups = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
