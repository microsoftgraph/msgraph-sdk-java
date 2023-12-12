package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailSearchFolder extends MailFolder implements Parsable {
    /**
     * Instantiates a new MailSearchFolder and sets the default values.
     */
    public MailSearchFolder() {
        super();
        this.setOdataType("#microsoft.graph.mailSearchFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailSearchFolder
     */
    @jakarta.annotation.Nonnull
    public static MailSearchFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailSearchFolder();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("filterQuery", (n) -> { this.setFilterQuery(n.getStringValue()); });
        deserializerMap.put("includeNestedFolders", (n) -> { this.setIncludeNestedFolders(n.getBooleanValue()); });
        deserializerMap.put("isSupported", (n) -> { this.setIsSupported(n.getBooleanValue()); });
        deserializerMap.put("sourceFolderIds", (n) -> { this.setSourceFolderIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filterQuery property value. The OData query to filter the messages.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilterQuery() {
        return this.backingStore.get("filterQuery");
    }
    /**
     * Gets the includeNestedFolders property value. Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeNestedFolders() {
        return this.backingStore.get("includeNestedFolders");
    }
    /**
     * Gets the isSupported property value. Indicates whether a search folder is editable using REST APIs.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSupported() {
        return this.backingStore.get("isSupported");
    }
    /**
     * Gets the sourceFolderIds property value. The mailbox folders that should be mined.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSourceFolderIds() {
        return this.backingStore.get("sourceFolderIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("filterQuery", this.getFilterQuery());
        writer.writeBooleanValue("includeNestedFolders", this.getIncludeNestedFolders());
        writer.writeBooleanValue("isSupported", this.getIsSupported());
        writer.writeCollectionOfPrimitiveValues("sourceFolderIds", this.getSourceFolderIds());
    }
    /**
     * Sets the filterQuery property value. The OData query to filter the messages.
     * @param value Value to set for the filterQuery property.
     */
    public void setFilterQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filterQuery", value);
    }
    /**
     * Sets the includeNestedFolders property value. Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     * @param value Value to set for the includeNestedFolders property.
     */
    public void setIncludeNestedFolders(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeNestedFolders", value);
    }
    /**
     * Sets the isSupported property value. Indicates whether a search folder is editable using REST APIs.
     * @param value Value to set for the isSupported property.
     */
    public void setIsSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSupported", value);
    }
    /**
     * Sets the sourceFolderIds property value. The mailbox folders that should be mined.
     * @param value Value to set for the sourceFolderIds property.
     */
    public void setSourceFolderIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sourceFolderIds", value);
    }
}
