package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageRuleActions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of categories to be assigned to a message.
     */
    private java.util.List<String> assignCategories;
    /**
     * The ID of a folder that a message is to be copied to.
     */
    private String copyToFolder;
    /**
     * Indicates whether a message should be moved to the Deleted Items folder.
     */
    private Boolean delete;
    /**
     * The email addresses of the recipients to which a message should be forwarded as an attachment.
     */
    private java.util.List<Recipient> forwardAsAttachmentTo;
    /**
     * The email addresses of the recipients to which a message should be forwarded.
     */
    private java.util.List<Recipient> forwardTo;
    /**
     * Indicates whether a message should be marked as read.
     */
    private Boolean markAsRead;
    /**
     * Sets the importance of the message, which can be: low, normal, high.
     */
    private Importance markImportance;
    /**
     * The ID of the folder that a message will be moved to.
     */
    private String moveToFolder;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     */
    private Boolean permanentDelete;
    /**
     * The email addresses to which a message should be redirected.
     */
    private java.util.List<Recipient> redirectTo;
    /**
     * Indicates whether subsequent rules should be evaluated.
     */
    private Boolean stopProcessingRules;
    /**
     * Instantiates a new MessageRuleActions and sets the default values.
     */
    public MessageRuleActions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageRuleActions
     */
    @jakarta.annotation.Nonnull
    public static MessageRuleActions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRuleActions();
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
     * Gets the assignCategories property value. A list of categories to be assigned to a message.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignCategories() {
        return this.assignCategories;
    }
    /**
     * Gets the copyToFolder property value. The ID of a folder that a message is to be copied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCopyToFolder() {
        return this.copyToFolder;
    }
    /**
     * Gets the delete property value. Indicates whether a message should be moved to the Deleted Items folder.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDelete() {
        return this.delete;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("assignCategories", (n) -> { this.setAssignCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("copyToFolder", (n) -> { this.setCopyToFolder(n.getStringValue()); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getBooleanValue()); });
        deserializerMap.put("forwardAsAttachmentTo", (n) -> { this.setForwardAsAttachmentTo(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardTo", (n) -> { this.setForwardTo(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("markAsRead", (n) -> { this.setMarkAsRead(n.getBooleanValue()); });
        deserializerMap.put("markImportance", (n) -> { this.setMarkImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("moveToFolder", (n) -> { this.setMoveToFolder(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permanentDelete", (n) -> { this.setPermanentDelete(n.getBooleanValue()); });
        deserializerMap.put("redirectTo", (n) -> { this.setRedirectTo(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("stopProcessingRules", (n) -> { this.setStopProcessingRules(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forwardAsAttachmentTo property value. The email addresses of the recipients to which a message should be forwarded as an attachment.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getForwardAsAttachmentTo() {
        return this.forwardAsAttachmentTo;
    }
    /**
     * Gets the forwardTo property value. The email addresses of the recipients to which a message should be forwarded.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getForwardTo() {
        return this.forwardTo;
    }
    /**
     * Gets the markAsRead property value. Indicates whether a message should be marked as read.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMarkAsRead() {
        return this.markAsRead;
    }
    /**
     * Gets the markImportance property value. Sets the importance of the message, which can be: low, normal, high.
     * @return a Importance
     */
    @jakarta.annotation.Nullable
    public Importance getMarkImportance() {
        return this.markImportance;
    }
    /**
     * Gets the moveToFolder property value. The ID of the folder that a message will be moved to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMoveToFolder() {
        return this.moveToFolder;
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
     * Gets the permanentDelete property value. Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPermanentDelete() {
        return this.permanentDelete;
    }
    /**
     * Gets the redirectTo property value. The email addresses to which a message should be redirected.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getRedirectTo() {
        return this.redirectTo;
    }
    /**
     * Gets the stopProcessingRules property value. Indicates whether subsequent rules should be evaluated.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStopProcessingRules() {
        return this.stopProcessingRules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("assignCategories", this.getAssignCategories());
        writer.writeStringValue("copyToFolder", this.getCopyToFolder());
        writer.writeBooleanValue("delete", this.getDelete());
        writer.writeCollectionOfObjectValues("forwardAsAttachmentTo", this.getForwardAsAttachmentTo());
        writer.writeCollectionOfObjectValues("forwardTo", this.getForwardTo());
        writer.writeBooleanValue("markAsRead", this.getMarkAsRead());
        writer.writeEnumValue("markImportance", this.getMarkImportance());
        writer.writeStringValue("moveToFolder", this.getMoveToFolder());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("permanentDelete", this.getPermanentDelete());
        writer.writeCollectionOfObjectValues("redirectTo", this.getRedirectTo());
        writer.writeBooleanValue("stopProcessingRules", this.getStopProcessingRules());
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
     * Sets the assignCategories property value. A list of categories to be assigned to a message.
     * @param value Value to set for the assignCategories property.
     */
    public void setAssignCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.assignCategories = value;
    }
    /**
     * Sets the copyToFolder property value. The ID of a folder that a message is to be copied to.
     * @param value Value to set for the copyToFolder property.
     */
    public void setCopyToFolder(@jakarta.annotation.Nullable final String value) {
        this.copyToFolder = value;
    }
    /**
     * Sets the delete property value. Indicates whether a message should be moved to the Deleted Items folder.
     * @param value Value to set for the delete property.
     */
    public void setDelete(@jakarta.annotation.Nullable final Boolean value) {
        this.delete = value;
    }
    /**
     * Sets the forwardAsAttachmentTo property value. The email addresses of the recipients to which a message should be forwarded as an attachment.
     * @param value Value to set for the forwardAsAttachmentTo property.
     */
    public void setForwardAsAttachmentTo(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.forwardAsAttachmentTo = value;
    }
    /**
     * Sets the forwardTo property value. The email addresses of the recipients to which a message should be forwarded.
     * @param value Value to set for the forwardTo property.
     */
    public void setForwardTo(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.forwardTo = value;
    }
    /**
     * Sets the markAsRead property value. Indicates whether a message should be marked as read.
     * @param value Value to set for the markAsRead property.
     */
    public void setMarkAsRead(@jakarta.annotation.Nullable final Boolean value) {
        this.markAsRead = value;
    }
    /**
     * Sets the markImportance property value. Sets the importance of the message, which can be: low, normal, high.
     * @param value Value to set for the markImportance property.
     */
    public void setMarkImportance(@jakarta.annotation.Nullable final Importance value) {
        this.markImportance = value;
    }
    /**
     * Sets the moveToFolder property value. The ID of the folder that a message will be moved to.
     * @param value Value to set for the moveToFolder property.
     */
    public void setMoveToFolder(@jakarta.annotation.Nullable final String value) {
        this.moveToFolder = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permanentDelete property value. Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     * @param value Value to set for the permanentDelete property.
     */
    public void setPermanentDelete(@jakarta.annotation.Nullable final Boolean value) {
        this.permanentDelete = value;
    }
    /**
     * Sets the redirectTo property value. The email addresses to which a message should be redirected.
     * @param value Value to set for the redirectTo property.
     */
    public void setRedirectTo(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.redirectTo = value;
    }
    /**
     * Sets the stopProcessingRules property value. Indicates whether subsequent rules should be evaluated.
     * @param value Value to set for the stopProcessingRules property.
     */
    public void setStopProcessingRules(@jakarta.annotation.Nullable final Boolean value) {
        this.stopProcessingRules = value;
    }
}
