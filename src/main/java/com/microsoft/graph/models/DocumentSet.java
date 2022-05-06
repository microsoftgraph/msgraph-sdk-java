package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DocumentSet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Content types allowed in document set.  */
    private java.util.List<ContentTypeInfo> _allowedContentTypes;
    /** Default contents of document set.  */
    private java.util.List<DocumentSetContent> _defaultContents;
    /** Indicates whether to add the name of the document set to each file name.  */
    private Boolean _propagateWelcomePageChanges;
    /** The sharedColumns property  */
    private java.util.List<ColumnDefinition> _sharedColumns;
    /** Add the name of the Document Set to each file name.  */
    private Boolean _shouldPrefixNameToFile;
    /** The welcomePageColumns property  */
    private java.util.List<ColumnDefinition> _welcomePageColumns;
    /** Welcome page absolute URL.  */
    private String _welcomePageUrl;
    /**
     * Instantiates a new documentSet and sets the default values.
     * @return a void
     */
    public DocumentSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentSet
     */
    @javax.annotation.Nonnull
    public static DocumentSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSet();
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
     * Gets the allowedContentTypes property value. Content types allowed in document set.
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ContentTypeInfo> getAllowedContentTypes() {
        return this._allowedContentTypes;
    }
    /**
     * Gets the defaultContents property value. Default contents of document set.
     * @return a documentSetContent
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentSetContent> getDefaultContents() {
        return this._defaultContents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DocumentSet currentObject = this;
        return new HashMap<>(7) {{
            this.put("allowedContentTypes", (n) -> { currentObject.setAllowedContentTypes(n.getCollectionOfObjectValues(ContentTypeInfo::createFromDiscriminatorValue)); });
            this.put("defaultContents", (n) -> { currentObject.setDefaultContents(n.getCollectionOfObjectValues(DocumentSetContent::createFromDiscriminatorValue)); });
            this.put("propagateWelcomePageChanges", (n) -> { currentObject.setPropagateWelcomePageChanges(n.getBooleanValue()); });
            this.put("sharedColumns", (n) -> { currentObject.setSharedColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("shouldPrefixNameToFile", (n) -> { currentObject.setShouldPrefixNameToFile(n.getBooleanValue()); });
            this.put("welcomePageColumns", (n) -> { currentObject.setWelcomePageColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("welcomePageUrl", (n) -> { currentObject.setWelcomePageUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the propagateWelcomePageChanges property value. Indicates whether to add the name of the document set to each file name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateWelcomePageChanges() {
        return this._propagateWelcomePageChanges;
    }
    /**
     * Gets the sharedColumns property value. The sharedColumns property
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getSharedColumns() {
        return this._sharedColumns;
    }
    /**
     * Gets the shouldPrefixNameToFile property value. Add the name of the Document Set to each file name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShouldPrefixNameToFile() {
        return this._shouldPrefixNameToFile;
    }
    /**
     * Gets the welcomePageColumns property value. The welcomePageColumns property
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getWelcomePageColumns() {
        return this._welcomePageColumns;
    }
    /**
     * Gets the welcomePageUrl property value. Welcome page absolute URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWelcomePageUrl() {
        return this._welcomePageUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("allowedContentTypes", this.getAllowedContentTypes());
        writer.writeCollectionOfObjectValues("defaultContents", this.getDefaultContents());
        writer.writeBooleanValue("propagateWelcomePageChanges", this.getPropagateWelcomePageChanges());
        writer.writeCollectionOfObjectValues("sharedColumns", this.getSharedColumns());
        writer.writeBooleanValue("shouldPrefixNameToFile", this.getShouldPrefixNameToFile());
        writer.writeCollectionOfObjectValues("welcomePageColumns", this.getWelcomePageColumns());
        writer.writeStringValue("welcomePageUrl", this.getWelcomePageUrl());
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
     * Sets the allowedContentTypes property value. Content types allowed in document set.
     * @param value Value to set for the allowedContentTypes property.
     * @return a void
     */
    public void setAllowedContentTypes(@javax.annotation.Nullable final java.util.List<ContentTypeInfo> value) {
        this._allowedContentTypes = value;
    }
    /**
     * Sets the defaultContents property value. Default contents of document set.
     * @param value Value to set for the defaultContents property.
     * @return a void
     */
    public void setDefaultContents(@javax.annotation.Nullable final java.util.List<DocumentSetContent> value) {
        this._defaultContents = value;
    }
    /**
     * Sets the propagateWelcomePageChanges property value. Indicates whether to add the name of the document set to each file name.
     * @param value Value to set for the propagateWelcomePageChanges property.
     * @return a void
     */
    public void setPropagateWelcomePageChanges(@javax.annotation.Nullable final Boolean value) {
        this._propagateWelcomePageChanges = value;
    }
    /**
     * Sets the sharedColumns property value. The sharedColumns property
     * @param value Value to set for the sharedColumns property.
     * @return a void
     */
    public void setSharedColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._sharedColumns = value;
    }
    /**
     * Sets the shouldPrefixNameToFile property value. Add the name of the Document Set to each file name.
     * @param value Value to set for the shouldPrefixNameToFile property.
     * @return a void
     */
    public void setShouldPrefixNameToFile(@javax.annotation.Nullable final Boolean value) {
        this._shouldPrefixNameToFile = value;
    }
    /**
     * Sets the welcomePageColumns property value. The welcomePageColumns property
     * @param value Value to set for the welcomePageColumns property.
     * @return a void
     */
    public void setWelcomePageColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._welcomePageColumns = value;
    }
    /**
     * Sets the welcomePageUrl property value. Welcome page absolute URL.
     * @param value Value to set for the welcomePageUrl property.
     * @return a void
     */
    public void setWelcomePageUrl(@javax.annotation.Nullable final String value) {
        this._welcomePageUrl = value;
    }
}
