package ai.houyi.openssp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Site {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.domain
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String domain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.category
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.description
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.keywords
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.ext
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private String ext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column site.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.id
     *
     * @return the value of site.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.id
     *
     * @param id the value for site.id
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.domain
     *
     * @return the value of site.domain
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.domain
     *
     * @param domain the value for site.domain
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.name
     *
     * @return the value of site.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.name
     *
     * @param name the value for site.name
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.category
     *
     * @return the value of site.category
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.category
     *
     * @param category the value for site.category
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.description
     *
     * @return the value of site.description
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.description
     *
     * @param description the value for site.description
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.keywords
     *
     * @return the value of site.keywords
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.keywords
     *
     * @param keywords the value for site.keywords
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.create_time
     *
     * @return the value of site.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.create_time
     *
     * @param createTime the value for site.create_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.update_time
     *
     * @return the value of site.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.update_time
     *
     * @param updateTime the value for site.update_time
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.ext
     *
     * @return the value of site.ext
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public String getExt() {
        return ext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.ext
     *
     * @param ext the value for site.ext
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column site.status
     *
     * @return the value of site.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column site.status
     *
     * @param status the value for site.status
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table site
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Site.Builder builder() {
        return new Site.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table site
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private Site obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new Site();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.id
         *
         * @param id the value for site.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.domain
         *
         * @param domain the value for site.domain
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder domain(String domain) {
            obj.setDomain(domain);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.name
         *
         * @param name the value for site.name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.category
         *
         * @param category the value for site.category
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder category(Integer category) {
            obj.setCategory(category);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.description
         *
         * @param description the value for site.description
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder description(String description) {
            obj.setDescription(description);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.keywords
         *
         * @param keywords the value for site.keywords
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder keywords(String keywords) {
            obj.setKeywords(keywords);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.create_time
         *
         * @param createTime the value for site.create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.update_time
         *
         * @param updateTime the value for site.update_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.ext
         *
         * @param ext the value for site.ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder ext(String ext) {
            obj.setExt(ext);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column site.status
         *
         * @param status the value for site.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Site build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table site
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        domain("domain", "domain", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        category("category", "category", "INTEGER", false),
        description("description", "description", "VARCHAR", false),
        keywords("keywords", "keywords", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        ext("ext", "ext", "VARCHAR", false),
        status("status", "status", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table site
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}