/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class BackupTOptions implements org.apache.thrift.TBase<BackupTOptions, BackupTOptions._Fields>, java.io.Serializable, Cloneable, Comparable<BackupTOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BackupTOptions");

  private static final org.apache.thrift.protocol.TField TARGET_DIRECTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("targetDirectory", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOCAL_FILE_SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("localFileSystem", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BackupTOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BackupTOptionsTupleSchemeFactory());
  }

  private String targetDirectory; // required
  private boolean localFileSystem; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TARGET_DIRECTORY((short)1, "targetDirectory"),
    LOCAL_FILE_SYSTEM((short)2, "localFileSystem");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TARGET_DIRECTORY
          return TARGET_DIRECTORY;
        case 2: // LOCAL_FILE_SYSTEM
          return LOCAL_FILE_SYSTEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LOCALFILESYSTEM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TARGET_DIRECTORY, new org.apache.thrift.meta_data.FieldMetaData("targetDirectory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCAL_FILE_SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("localFileSystem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BackupTOptions.class, metaDataMap);
  }

  public BackupTOptions() {
  }

  public BackupTOptions(
    String targetDirectory,
    boolean localFileSystem)
  {
    this();
    this.targetDirectory = targetDirectory;
    this.localFileSystem = localFileSystem;
    setLocalFileSystemIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BackupTOptions(BackupTOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTargetDirectory()) {
      this.targetDirectory = other.targetDirectory;
    }
    this.localFileSystem = other.localFileSystem;
  }

  public BackupTOptions deepCopy() {
    return new BackupTOptions(this);
  }

  @Override
  public void clear() {
    this.targetDirectory = null;
    setLocalFileSystemIsSet(false);
    this.localFileSystem = false;
  }

  public String getTargetDirectory() {
    return this.targetDirectory;
  }

  public BackupTOptions setTargetDirectory(String targetDirectory) {
    this.targetDirectory = targetDirectory;
    return this;
  }

  public void unsetTargetDirectory() {
    this.targetDirectory = null;
  }

  /** Returns true if field targetDirectory is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetDirectory() {
    return this.targetDirectory != null;
  }

  public void setTargetDirectoryIsSet(boolean value) {
    if (!value) {
      this.targetDirectory = null;
    }
  }

  public boolean isLocalFileSystem() {
    return this.localFileSystem;
  }

  public BackupTOptions setLocalFileSystem(boolean localFileSystem) {
    this.localFileSystem = localFileSystem;
    setLocalFileSystemIsSet(true);
    return this;
  }

  public void unsetLocalFileSystem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCALFILESYSTEM_ISSET_ID);
  }

  /** Returns true if field localFileSystem is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalFileSystem() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCALFILESYSTEM_ISSET_ID);
  }

  public void setLocalFileSystemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCALFILESYSTEM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TARGET_DIRECTORY:
      if (value == null) {
        unsetTargetDirectory();
      } else {
        setTargetDirectory((String)value);
      }
      break;

    case LOCAL_FILE_SYSTEM:
      if (value == null) {
        unsetLocalFileSystem();
      } else {
        setLocalFileSystem((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET_DIRECTORY:
      return getTargetDirectory();

    case LOCAL_FILE_SYSTEM:
      return isLocalFileSystem();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TARGET_DIRECTORY:
      return isSetTargetDirectory();
    case LOCAL_FILE_SYSTEM:
      return isSetLocalFileSystem();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BackupTOptions)
      return this.equals((BackupTOptions)that);
    return false;
  }

  public boolean equals(BackupTOptions that) {
    if (that == null)
      return false;

    boolean this_present_targetDirectory = true && this.isSetTargetDirectory();
    boolean that_present_targetDirectory = true && that.isSetTargetDirectory();
    if (this_present_targetDirectory || that_present_targetDirectory) {
      if (!(this_present_targetDirectory && that_present_targetDirectory))
        return false;
      if (!this.targetDirectory.equals(that.targetDirectory))
        return false;
    }

    boolean this_present_localFileSystem = true;
    boolean that_present_localFileSystem = true;
    if (this_present_localFileSystem || that_present_localFileSystem) {
      if (!(this_present_localFileSystem && that_present_localFileSystem))
        return false;
      if (this.localFileSystem != that.localFileSystem)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_targetDirectory = true && (isSetTargetDirectory());
    list.add(present_targetDirectory);
    if (present_targetDirectory)
      list.add(targetDirectory);

    boolean present_localFileSystem = true;
    list.add(present_localFileSystem);
    if (present_localFileSystem)
      list.add(localFileSystem);

    return list.hashCode();
  }

  @Override
  public int compareTo(BackupTOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTargetDirectory()).compareTo(other.isSetTargetDirectory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetDirectory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetDirectory, other.targetDirectory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocalFileSystem()).compareTo(other.isSetLocalFileSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalFileSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localFileSystem, other.localFileSystem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BackupTOptions(");
    boolean first = true;

    sb.append("targetDirectory:");
    if (this.targetDirectory == null) {
      sb.append("null");
    } else {
      sb.append(this.targetDirectory);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("localFileSystem:");
    sb.append(this.localFileSystem);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BackupTOptionsStandardSchemeFactory implements SchemeFactory {
    public BackupTOptionsStandardScheme getScheme() {
      return new BackupTOptionsStandardScheme();
    }
  }

  private static class BackupTOptionsStandardScheme extends StandardScheme<BackupTOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BackupTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET_DIRECTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.targetDirectory = iprot.readString();
              struct.setTargetDirectoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCAL_FILE_SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.localFileSystem = iprot.readBool();
              struct.setLocalFileSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BackupTOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.targetDirectory != null) {
        oprot.writeFieldBegin(TARGET_DIRECTORY_FIELD_DESC);
        oprot.writeString(struct.targetDirectory);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LOCAL_FILE_SYSTEM_FIELD_DESC);
      oprot.writeBool(struct.localFileSystem);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BackupTOptionsTupleSchemeFactory implements SchemeFactory {
    public BackupTOptionsTupleScheme getScheme() {
      return new BackupTOptionsTupleScheme();
    }
  }

  private static class BackupTOptionsTupleScheme extends TupleScheme<BackupTOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BackupTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTargetDirectory()) {
        optionals.set(0);
      }
      if (struct.isSetLocalFileSystem()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTargetDirectory()) {
        oprot.writeString(struct.targetDirectory);
      }
      if (struct.isSetLocalFileSystem()) {
        oprot.writeBool(struct.localFileSystem);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BackupTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.targetDirectory = iprot.readString();
        struct.setTargetDirectoryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.localFileSystem = iprot.readBool();
        struct.setLocalFileSystemIsSet(true);
      }
    }
  }

}

