package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FolderView implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The method by which the folder should be sorted.
     */
    private String sortBy;
    /**
     * If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
     */
    private String sortOrder;
    /**
     * The type of view that should be used to represent the folder.
     */
    private String viewType;
    /**
     * Instantiates a new folderView and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FolderView() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a folderView
     */
    @javax.annotation.Nonnull
    public static FolderView createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FolderView();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sortBy", (n) -> { this.setSortBy(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getStringValue()); });
        deserializerMap.put("viewType", (n) -> { this.setViewType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the sortBy property value. The method by which the folder should be sorted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSortBy() {
        return this.sortBy;
    }
    /**
     * Gets the sortOrder property value. If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the viewType property value. The type of view that should be used to represent the folder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getViewType() {
        return this.viewType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sortBy", this.getSortBy());
        writer.writeStringValue("sortOrder", this.getSortOrder());
        writer.writeStringValue("viewType", this.getViewType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sortBy property value. The method by which the folder should be sorted.
     * @param value Value to set for the sortBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSortBy(@javax.annotation.Nullable final String value) {
        this.sortBy = value;
    }
    /**
     * Sets the sortOrder property value. If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
     * @param value Value to set for the sortOrder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSortOrder(@javax.annotation.Nullable final String value) {
        this.sortOrder = value;
    }
    /**
     * Sets the viewType property value. The type of view that should be used to represent the folder.
     * @param value Value to set for the viewType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setViewType(@javax.annotation.Nullable final String value) {
        this.viewType = value;
    }
}
