package com.microsoft.graph.users.item.onenote.notebooks.item.copynotebook;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CopyNotebookPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The groupId property
     */
    private String groupId;
    /**
     * The notebookFolder property
     */
    private String notebookFolder;
    /**
     * The renameAs property
     */
    private String renameAs;
    /**
     * The siteCollectionId property
     */
    private String siteCollectionId;
    /**
     * The siteId property
     */
    private String siteId;
    /**
     * Instantiates a new copyNotebookPostRequestBody and sets the default values.
     */
    public CopyNotebookPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyNotebookPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CopyNotebookPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyNotebookPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("notebookFolder", (n) -> { this.setNotebookFolder(n.getStringValue()); });
        deserializerMap.put("renameAs", (n) -> { this.setRenameAs(n.getStringValue()); });
        deserializerMap.put("siteCollectionId", (n) -> { this.setSiteCollectionId(n.getStringValue()); });
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the notebookFolder property value. The notebookFolder property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotebookFolder() {
        return this.notebookFolder;
    }
    /**
     * Gets the renameAs property value. The renameAs property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRenameAs() {
        return this.renameAs;
    }
    /**
     * Gets the siteCollectionId property value. The siteCollectionId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSiteCollectionId() {
        return this.siteCollectionId;
    }
    /**
     * Gets the siteId property value. The siteId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("notebookFolder", this.getNotebookFolder());
        writer.writeStringValue("renameAs", this.getRenameAs());
        writer.writeStringValue("siteCollectionId", this.getSiteCollectionId());
        writer.writeStringValue("siteId", this.getSiteId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the notebookFolder property value. The notebookFolder property
     * @param value Value to set for the notebookFolder property.
     */
    public void setNotebookFolder(@jakarta.annotation.Nullable final String value) {
        this.notebookFolder = value;
    }
    /**
     * Sets the renameAs property value. The renameAs property
     * @param value Value to set for the renameAs property.
     */
    public void setRenameAs(@jakarta.annotation.Nullable final String value) {
        this.renameAs = value;
    }
    /**
     * Sets the siteCollectionId property value. The siteCollectionId property
     * @param value Value to set for the siteCollectionId property.
     */
    public void setSiteCollectionId(@jakarta.annotation.Nullable final String value) {
        this.siteCollectionId = value;
    }
    /**
     * Sets the siteId property value. The siteId property
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final String value) {
        this.siteId = value;
    }
}
