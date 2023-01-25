package org.eclipse.papyrus.sysml16.diagram.common.css.dom:
  This package contains a calculation of attributes that can in turn be used by
  style-sheets, as if it was an attribute of the selected model element. Please note
  that some attributes are not used by SysML, but by standard diagrams such as the
  activity diagram. The calculation of these attributes is duplicated here, in order
  to enable the use of these diagrams in models that apply the SysML profile.

Attributes for standard diagrams:
  - "isTimeEventAction": true, if the selected element is an AcceptEventAction and at least one of the triggers is a TimeEvent

  - "appliedStereotypes": list of applied stereotypes. The list contains two entries for each stereotype: the name and the qualified-name

  - "typeAppliedStereotypes": list of stereotypes applied to the type of the selected element (if it is a typed element)
    The list contains two entries for each stereotype: the name and the qualified-name

  - "isFrame": true, if the eContainer of the notationElement is the diagram

Attributes for SysML diagrams:
  - "portDirection":  one of "in", "out", "inout" or "portDirNA"
	In case of FlowPorts:
      - evaluate the direction of atomic flow ports.
      - if typed with a flow specification, evaluate the flow-properties: if there is a common direction, return it, return inout otherwise
      - if no flow-property is found or the port is not typed with a flow specification, return "portDirNA"
    In case of ProxyPorts or FullPorts:
      - if typed with a class, evaluate the flow-properties: if there is a common direction, return it, return inout otherwise
      - if no flow-property is found or it is not typed with a class, return "portDirNA"
    (used in internal block diagram)

  - "deprecated": true, if the SysML element is deprecated
    (used in several diagrams)

  - "isConstraint": true, if element-type = ORG_ECLIPSE_PAPYRUS_SYSML16_CONSTRAINTPROPERTY
    (used in parametric diagram)

  - "isPart": true, if element-type = ORG_ECLIPSE_PAPYRUS_SYSML16_PART
    (currently not used by SysML)

  - "isReference": true, if element-type = ORG_ECLIPSE_PAPYRUS_SYSML16_REFERENCE
    (used in internal block diagram)