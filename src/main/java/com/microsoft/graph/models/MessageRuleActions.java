package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageRuleActions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A list of categories to be assigned to a message. */
    private java.util.List<String> _assignCategories;
    /** The ID of a folder that a message is to be copied to. */
    private String _copyToFolder;
    /** Indicates whether a message should be moved to the Deleted Items folder. */
    private Boolean _delete;
    /** The email addresses of the recipients to which a message should be forwarded as an attachment. */
    private java.util.List<Recipient> _forwardAsAttachmentTo;
    /** The email addresses of the recipients to which a message should be forwarded. */
    private java.util.List<Recipient> _forwardTo;
    /** Indicates whether a message should be marked as read. */
    private Boolean _markAsRead;
    /** Sets the importance of the message, which can be: low, normal, high. */
    private Importance _markImportance;
    /** The ID of the folder that a message will be moved to. */
    private String _moveToFolder;
    /** The OdataType property */
    private String _odataType;
    /** Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder. */
    private Boolean _permanentDelete;
    /** The email addresses to which a message should be redirected. */
    private java.util.List<Recipient> _redirectTo;
    /** Indicates whether subsequent rules should be evaluated. */
    private Boolean _stopProcessingRules;
    /**
     * Instantiates a new messageRuleActions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MessageRuleActions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageRuleActions
     */
    @javax.annotation.Nonnull
    public static MessageRuleActions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRuleActions();
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
     * Gets the assignCategories property value. A list of categories to be assigned to a message.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAssignCategories() {
        return this._assignCategories;
    }
    /**
     * Gets the copyToFolder property value. The ID of a folder that a message is to be copied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCopyToFolder() {
        return this._copyToFolder;
    }
    /**
     * Gets the delete property value. Indicates whether a message should be moved to the Deleted Items folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDelete() {
        return this._delete;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(12);
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
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getForwardAsAttachmentTo() {
        return this._forwardAsAttachmentTo;
    }
    /**
     * Gets the forwardTo property value. The email addresses of the recipients to which a message should be forwarded.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getForwardTo() {
        return this._forwardTo;
    }
    /**
     * Gets the markAsRead property value. Indicates whether a message should be marked as read.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMarkAsRead() {
        return this._markAsRead;
    }
    /**
     * Gets the markImportance property value. Sets the importance of the message, which can be: low, normal, high.
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getMarkImportance() {
        return this._markImportance;
    }
    /**
     * Gets the moveToFolder property value. The ID of the folder that a message will be moved to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMoveToFolder() {
        return this._moveToFolder;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the permanentDelete property value. Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPermanentDelete() {
        return this._permanentDelete;
    }
    /**
     * Gets the redirectTo property value. The email addresses to which a message should be redirected.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getRedirectTo() {
        return this._redirectTo;
    }
    /**
     * Gets the stopProcessingRules property value. Indicates whether subsequent rules should be evaluated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStopProcessingRules() {
        return this._stopProcessingRules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignCategories property value. A list of categories to be assigned to a message.
     * @param value Value to set for the assignCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._assignCategories = value;
    }
    /**
     * Sets the copyToFolder property value. The ID of a folder that a message is to be copied to.
     * @param value Value to set for the copyToFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopyToFolder(@javax.annotation.Nullable final String value) {
        this._copyToFolder = value;
    }
    /**
     * Sets the delete property value. Indicates whether a message should be moved to the Deleted Items folder.
     * @param value Value to set for the delete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelete(@javax.annotation.Nullable final Boolean value) {
        this._delete = value;
    }
    /**
     * Sets the forwardAsAttachmentTo property value. The email addresses of the recipients to which a message should be forwarded as an attachment.
     * @param value Value to set for the forwardAsAttachmentTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForwardAsAttachmentTo(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._forwardAsAttachmentTo = value;
    }
    /**
     * Sets the forwardTo property value. The email addresses of the recipients to which a message should be forwarded.
     * @param value Value to set for the forwardTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForwardTo(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._forwardTo = value;
    }
    /**
     * Sets the markAsRead property value. Indicates whether a message should be marked as read.
     * @param value Value to set for the markAsRead property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarkAsRead(@javax.annotation.Nullable final Boolean value) {
        this._markAsRead = value;
    }
    /**
     * Sets the markImportance property value. Sets the importance of the message, which can be: low, normal, high.
     * @param value Value to set for the markImportance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarkImportance(@javax.annotation.Nullable final Importance value) {
        this._markImportance = value;
    }
    /**
     * Sets the moveToFolder property value. The ID of the folder that a message will be moved to.
     * @param value Value to set for the moveToFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMoveToFolder(@javax.annotation.Nullable final String value) {
        this._moveToFolder = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the permanentDelete property value. Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     * @param value Value to set for the permanentDelete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermanentDelete(@javax.annotation.Nullable final Boolean value) {
        this._permanentDelete = value;
    }
    /**
     * Sets the redirectTo property value. The email addresses to which a message should be redirected.
     * @param value Value to set for the redirectTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectTo(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._redirectTo = value;
    }
    /**
     * Sets the stopProcessingRules property value. Indicates whether subsequent rules should be evaluated.
     * @param value Value to set for the stopProcessingRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStopProcessingRules(@javax.annotation.Nullable final Boolean value) {
        this._stopProcessingRules = value;
    }
}
