package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Audio implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The title of the album for this audio file. */
    private String _album;
    /** The artist named on the album for the audio file. */
    private String _albumArtist;
    /** The performing artist for the audio file. */
    private String _artist;
    /** Bitrate expressed in kbps. */
    private Long _bitrate;
    /** The name of the composer of the audio file. */
    private String _composers;
    /** Copyright information for the audio file. */
    private String _copyright;
    /** The number of the disc this audio file came from. */
    private Integer _disc;
    /** The total number of discs in this album. */
    private Integer _discCount;
    /** Duration of the audio file, expressed in milliseconds */
    private Long _duration;
    /** The genre of this audio file. */
    private String _genre;
    /** Indicates if the file is protected with digital rights management. */
    private Boolean _hasDrm;
    /** Indicates if the file is encoded with a variable bitrate. */
    private Boolean _isVariableBitrate;
    /** The OdataType property */
    private String _odataType;
    /** The title of the audio file. */
    private String _title;
    /** The number of the track on the original disc for this audio file. */
    private Integer _track;
    /** The total number of tracks on the original disc for this audio file. */
    private Integer _trackCount;
    /** The year the audio file was recorded. */
    private Integer _year;
    /**
     * Instantiates a new audio and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Audio() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.audio");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a audio
     */
    @javax.annotation.Nonnull
    public static Audio createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Audio();
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
     * Gets the album property value. The title of the album for this audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlbum() {
        return this._album;
    }
    /**
     * Gets the albumArtist property value. The artist named on the album for the audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlbumArtist() {
        return this._albumArtist;
    }
    /**
     * Gets the artist property value. The performing artist for the audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getArtist() {
        return this._artist;
    }
    /**
     * Gets the bitrate property value. Bitrate expressed in kbps.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getBitrate() {
        return this._bitrate;
    }
    /**
     * Gets the composers property value. The name of the composer of the audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComposers() {
        return this._composers;
    }
    /**
     * Gets the copyright property value. Copyright information for the audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCopyright() {
        return this._copyright;
    }
    /**
     * Gets the disc property value. The number of the disc this audio file came from.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDisc() {
        return this._disc;
    }
    /**
     * Gets the discCount property value. The total number of discs in this album.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDiscCount() {
        return this._discCount;
    }
    /**
     * Gets the duration property value. Duration of the audio file, expressed in milliseconds
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDuration() {
        return this._duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Audio currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(17);
        deserializerMap.put("album", (n) -> { currentObject.setAlbum(n.getStringValue()); });
        deserializerMap.put("albumArtist", (n) -> { currentObject.setAlbumArtist(n.getStringValue()); });
        deserializerMap.put("artist", (n) -> { currentObject.setArtist(n.getStringValue()); });
        deserializerMap.put("bitrate", (n) -> { currentObject.setBitrate(n.getLongValue()); });
        deserializerMap.put("composers", (n) -> { currentObject.setComposers(n.getStringValue()); });
        deserializerMap.put("copyright", (n) -> { currentObject.setCopyright(n.getStringValue()); });
        deserializerMap.put("disc", (n) -> { currentObject.setDisc(n.getIntegerValue()); });
        deserializerMap.put("discCount", (n) -> { currentObject.setDiscCount(n.getIntegerValue()); });
        deserializerMap.put("duration", (n) -> { currentObject.setDuration(n.getLongValue()); });
        deserializerMap.put("genre", (n) -> { currentObject.setGenre(n.getStringValue()); });
        deserializerMap.put("hasDrm", (n) -> { currentObject.setHasDrm(n.getBooleanValue()); });
        deserializerMap.put("isVariableBitrate", (n) -> { currentObject.setIsVariableBitrate(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        deserializerMap.put("track", (n) -> { currentObject.setTrack(n.getIntegerValue()); });
        deserializerMap.put("trackCount", (n) -> { currentObject.setTrackCount(n.getIntegerValue()); });
        deserializerMap.put("year", (n) -> { currentObject.setYear(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the genre property value. The genre of this audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGenre() {
        return this._genre;
    }
    /**
     * Gets the hasDrm property value. Indicates if the file is protected with digital rights management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasDrm() {
        return this._hasDrm;
    }
    /**
     * Gets the isVariableBitrate property value. Indicates if the file is encoded with a variable bitrate.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVariableBitrate() {
        return this._isVariableBitrate;
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
     * Gets the title property value. The title of the audio file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the track property value. The number of the track on the original disc for this audio file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTrack() {
        return this._track;
    }
    /**
     * Gets the trackCount property value. The total number of tracks on the original disc for this audio file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTrackCount() {
        return this._trackCount;
    }
    /**
     * Gets the year property value. The year the audio file was recorded.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getYear() {
        return this._year;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("album", this.getAlbum());
        writer.writeStringValue("albumArtist", this.getAlbumArtist());
        writer.writeStringValue("artist", this.getArtist());
        writer.writeLongValue("bitrate", this.getBitrate());
        writer.writeStringValue("composers", this.getComposers());
        writer.writeStringValue("copyright", this.getCopyright());
        writer.writeIntegerValue("disc", this.getDisc());
        writer.writeIntegerValue("discCount", this.getDiscCount());
        writer.writeLongValue("duration", this.getDuration());
        writer.writeStringValue("genre", this.getGenre());
        writer.writeBooleanValue("hasDrm", this.getHasDrm());
        writer.writeBooleanValue("isVariableBitrate", this.getIsVariableBitrate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("title", this.getTitle());
        writer.writeIntegerValue("track", this.getTrack());
        writer.writeIntegerValue("trackCount", this.getTrackCount());
        writer.writeIntegerValue("year", this.getYear());
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
     * Sets the album property value. The title of the album for this audio file.
     * @param value Value to set for the album property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlbum(@javax.annotation.Nullable final String value) {
        this._album = value;
    }
    /**
     * Sets the albumArtist property value. The artist named on the album for the audio file.
     * @param value Value to set for the albumArtist property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlbumArtist(@javax.annotation.Nullable final String value) {
        this._albumArtist = value;
    }
    /**
     * Sets the artist property value. The performing artist for the audio file.
     * @param value Value to set for the artist property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArtist(@javax.annotation.Nullable final String value) {
        this._artist = value;
    }
    /**
     * Sets the bitrate property value. Bitrate expressed in kbps.
     * @param value Value to set for the bitrate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitrate(@javax.annotation.Nullable final Long value) {
        this._bitrate = value;
    }
    /**
     * Sets the composers property value. The name of the composer of the audio file.
     * @param value Value to set for the composers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComposers(@javax.annotation.Nullable final String value) {
        this._composers = value;
    }
    /**
     * Sets the copyright property value. Copyright information for the audio file.
     * @param value Value to set for the copyright property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopyright(@javax.annotation.Nullable final String value) {
        this._copyright = value;
    }
    /**
     * Sets the disc property value. The number of the disc this audio file came from.
     * @param value Value to set for the disc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisc(@javax.annotation.Nullable final Integer value) {
        this._disc = value;
    }
    /**
     * Sets the discCount property value. The total number of discs in this album.
     * @param value Value to set for the discCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscCount(@javax.annotation.Nullable final Integer value) {
        this._discCount = value;
    }
    /**
     * Sets the duration property value. Duration of the audio file, expressed in milliseconds
     * @param value Value to set for the duration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuration(@javax.annotation.Nullable final Long value) {
        this._duration = value;
    }
    /**
     * Sets the genre property value. The genre of this audio file.
     * @param value Value to set for the genre property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGenre(@javax.annotation.Nullable final String value) {
        this._genre = value;
    }
    /**
     * Sets the hasDrm property value. Indicates if the file is protected with digital rights management.
     * @param value Value to set for the hasDrm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasDrm(@javax.annotation.Nullable final Boolean value) {
        this._hasDrm = value;
    }
    /**
     * Sets the isVariableBitrate property value. Indicates if the file is encoded with a variable bitrate.
     * @param value Value to set for the isVariableBitrate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVariableBitrate(@javax.annotation.Nullable final Boolean value) {
        this._isVariableBitrate = value;
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
     * Sets the title property value. The title of the audio file.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the track property value. The number of the track on the original disc for this audio file.
     * @param value Value to set for the track property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrack(@javax.annotation.Nullable final Integer value) {
        this._track = value;
    }
    /**
     * Sets the trackCount property value. The total number of tracks on the original disc for this audio file.
     * @param value Value to set for the trackCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrackCount(@javax.annotation.Nullable final Integer value) {
        this._trackCount = value;
    }
    /**
     * Sets the year property value. The year the audio file was recorded.
     * @param value Value to set for the year property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYear(@javax.annotation.Nullable final Integer value) {
        this._year = value;
    }
}
