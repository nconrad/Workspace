package org.patricbrc.Workspace;

import java.io.*;
import java.util.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.annotate.*;
import org.codehaus.jackson.type.*;
import org.codehaus.jackson.*;



@JsonSerialize(using = args_ls_serializer.class)
@JsonDeserialize(using = args_ls_deserializer.class)
public class args_ls
{
    public list_params input;
}


