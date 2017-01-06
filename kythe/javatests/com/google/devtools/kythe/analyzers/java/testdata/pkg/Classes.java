//- @pkg ref Package
//- Package.node/kind package
package pkg;

// Checks that classes are record/class nodes and enums are sum/enumClass nodes

//- @Classes defines/binding N
//- N.node/kind record
//- N.subkind class
//- N.access public
//- N childof Package
public class Classes {

  //- DefaultCtor childof N
  //- DefaultCtor.node/kind function
  //- DefaultCtor.generated true
  //- DefaultCtor typed DefaultCtorType
  //- DefaultCtorType param.0 FnBuiltin
  //- DefaultCtorType param.1 N
  //- !{ DefaultCtorAnchor defines/binding DefaultCtor }

  //- @StaticInner defines/binding SI
  //- SI.node/kind record
  //- SI.subkind class
  //- SI.access private
  //- SI.static true
  //- SI.abstract true
  //- SI childof N
  private static abstract class StaticInner {
    //- Ctor childof SI
    //- Ctor.node/kind function
    //- Ctor typed CtorType
    //- CtorType param.0 FnBuiltin
    //- CtorType param.1 SI
    //- @StaticInner defines/binding Ctor
    //- !{ Ctor.generated true }
    public StaticInner() {}
  }

  //- @Inner defines/binding I
  //- I.node/kind record
  //- I.subkind class
  //- I.access protected
  //- I.final true
  //- I childof N
  protected final class Inner {}

  //- @Enum defines/binding E
  //- E.node/kind sum
  //- E.subkind enumClass
  //- E.access default
  //- E childof N
  static enum Enum {}
}
