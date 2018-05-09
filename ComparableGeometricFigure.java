//generic interface so only Geometric figures can be compared to each other
interface ComparableGeometricFigure<T extends GeometricFigure2> extends Comparable<T> {
}
