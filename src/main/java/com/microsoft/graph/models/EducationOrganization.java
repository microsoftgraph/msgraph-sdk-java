package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the educationRoot singleton. */
public class EducationOrganization extends Entity implements Parsable {
    /** Organization description. */
    private String _description;
    /** Organization display name. */
    private String _displayName;
    /** Where this user was created from. Possible values are: sis, lms, or manual. */
    private EducationExternalSource _externalSource;
    /** The name of the external source this resources was generated from. */
    private String _externalSourceDetail;
    /**
     * Instantiates a new educationOrganization and sets the default values.
     * @return a void
     */
    public EducationOrganization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationOrganization
     */
    @javax.annotation.Nonnull
    public static EducationOrganization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.educationOrganization": return new EducationOrganization();
            }
        }
        return new EducationOrganization();
    }
    /**
     * Gets the description property value. Organization description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Organization display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalSource property value. Where this user was created from. Possible values are: sis, lms, or manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this._externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this._externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationOrganization currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalSource", (n) -> { currentObject.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
            this.put("externalSourceDetail", (n) -> { currentObject.setExternalSourceDetail(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("externalSource", this.getExternalSource());
        writer.writeStringValue("externalSourceDetail", this.getExternalSourceDetail());
    }
    /**
     * Sets the description property value. Organization description.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Organization display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalSource property value. Where this user was created from. Possible values are: sis, lms, or manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this._externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this._externalSourceDetail = value;
    }
}
