package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DataSubject implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Email of the data subject.  */
    private String _email;
    /** First name of the data subject.  */
    private String _firstName;
    /** Last Name of the data subject.  */
    private String _lastName;
    /** The country/region of residency. The residency information is uesed only for internal reporting but not for the content search.  */
    private String _residency;
    /**
     * Instantiates a new dataSubject and sets the default values.
     * @return a void
     */
    public DataSubject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataSubject
     */
    @javax.annotation.Nonnull
    public static DataSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataSubject();
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
     * Gets the email property value. Email of the data subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DataSubject currentObject = this;
        return new HashMap<>(4) {{
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("firstName", (n) -> { currentObject.setFirstName(n.getStringValue()); });
            this.put("lastName", (n) -> { currentObject.setLastName(n.getStringValue()); });
            this.put("residency", (n) -> { currentObject.setResidency(n.getStringValue()); });
        }};
    }
    /**
     * Gets the firstName property value. First name of the data subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return this._firstName;
    }
    /**
     * Gets the lastName property value. Last Name of the data subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return this._lastName;
    }
    /**
     * Gets the residency property value. The country/region of residency. The residency information is uesed only for internal reporting but not for the content search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResidency() {
        return this._residency;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("residency", this.getResidency());
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
     * Sets the email property value. Email of the data subject.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the firstName property value. First name of the data subject.
     * @param value Value to set for the firstName property.
     * @return a void
     */
    public void setFirstName(@javax.annotation.Nullable final String value) {
        this._firstName = value;
    }
    /**
     * Sets the lastName property value. Last Name of the data subject.
     * @param value Value to set for the lastName property.
     * @return a void
     */
    public void setLastName(@javax.annotation.Nullable final String value) {
        this._lastName = value;
    }
    /**
     * Sets the residency property value. The country/region of residency. The residency information is uesed only for internal reporting but not for the content search.
     * @param value Value to set for the residency property.
     * @return a void
     */
    public void setResidency(@javax.annotation.Nullable final String value) {
        this._residency = value;
    }
}
