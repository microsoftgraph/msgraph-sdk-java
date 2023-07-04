package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Filter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The categoryFilterGroups property
     */
    private java.util.List<FilterGroup> categoryFilterGroups;
    /**
     * The groups property
     */
    private java.util.List<FilterGroup> groups;
    /**
     * The inputFilterGroups property
     */
    private java.util.List<FilterGroup> inputFilterGroups;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new filter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Filter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filter
     */
    @javax.annotation.Nonnull
    public static Filter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Filter();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the categoryFilterGroups property value. The categoryFilterGroups property
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getCategoryFilterGroups() {
        return this.categoryFilterGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("categoryFilterGroups", (n) -> { this.setCategoryFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("inputFilterGroups", (n) -> { this.setInputFilterGroups(n.getCollectionOfObjectValues(FilterGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getGroups() {
        return this.groups;
    }
    /**
     * Gets the inputFilterGroups property value. The inputFilterGroups property
     * @return a filterGroup
     */
    @javax.annotation.Nullable
    public java.util.List<FilterGroup> getInputFilterGroups() {
        return this.inputFilterGroups;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryFilterGroups", this.getCategoryFilterGroups());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfObjectValues("inputFilterGroups", this.getInputFilterGroups());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the categoryFilterGroups property value. The categoryFilterGroups property
     * @param value Value to set for the categoryFilterGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryFilterGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.categoryFilterGroups = value;
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.groups = value;
    }
    /**
     * Sets the inputFilterGroups property value. The inputFilterGroups property
     * @param value Value to set for the inputFilterGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputFilterGroups(@javax.annotation.Nullable final java.util.List<FilterGroup> value) {
        this.inputFilterGroups = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
