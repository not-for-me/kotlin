
apply { plugin("kotlin") }

dependencies {
    val compile by configurations
    compile(project(":core"))
    compile(project(":compiler:util"))
    compile(project(":compiler:container"))
    compile(project(":compiler:resolution"))
    compile(project(":kotlin-script-runtime"))
    compile(commonDep("io.javaslang","javaslang"))
}

configureKotlinProjectSourcesDefault()
configureKotlinProjectNoTests()

