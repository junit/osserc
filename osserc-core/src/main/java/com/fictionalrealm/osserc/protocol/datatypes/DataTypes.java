// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataTypes.proto

package com.fictionalrealm.osserc.protocol.datatypes;

public final class DataTypes {
  private DataTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017DataTypes.proto\022\tosserc.dt*i\n\014ServerSt" +
      "atus\022\n\n\006ONLINE\020\000\022\013\n\007OFFLINE\020\001\022\027\n\023AUTH_SE" +
      "RVER_OFFLINE\020\002\022\017\n\013MAINTENANCE\020\003\022\026\n\022MAP_S" +
      "ERVER_OFFLINE\020\004*Y\n\023DisconnectionReason\022\023" +
      "\n\017SERVER_SHUTDOWN\020\000\022\025\n\021WRONG_CREDENTIALS" +
      "\020\001\022\013\n\007TIMEOUT\020\002\022\t\n\005OTHER\020\003B2\n,com.fictio" +
      "nalrealm.osserc.protocol.datatypesH\001P\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}