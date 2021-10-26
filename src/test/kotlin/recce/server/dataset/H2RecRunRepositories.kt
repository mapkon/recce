package recce.server.dataset

import io.micronaut.context.annotation.Replaces
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.r2dbc.operations.R2dbcOperations

/**
 * Allow running of repository tests against H2 Database for speed. To re-evaluate later if we would prefer to use
 * slower TestContainers startups
 */
@Replaces(RecRunRepository::class)
@R2dbcRepository(dialect = Dialect.H2)
interface H2RecRunRepository : RecRunRepository

/**
 * Allow running of repository tests against H2 Database for speed. To re-evaluate later if we would prefer to use
 * slower TestContainers startups
 */
@Replaces(RecRecordRepository::class)
@R2dbcRepository(dialect = Dialect.H2)
abstract class H2RecRunRecordRepository(operations: R2dbcOperations) : RecRecordRepository(operations)
