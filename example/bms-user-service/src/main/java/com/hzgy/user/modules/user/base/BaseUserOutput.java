package com.hzgy.user.modules.user.base;

import com.hzgy.core.entity.BaseOutput;
import com.hzgy.user.modules.userrolerelation.entity.UserRoleRelationOutput;
import com.hzgy.user.modules.organization.entity.OrganizationOutput;
import java.util.List;

public abstract class BaseUserOutput extends BaseOutput {


	/**用户ID-主键Id**/
	private Long id;

	/**机构ID-**/
	private Long orgId;

	/**用户登录帐号-用户登录账号**/
	private String account;

	/**手机账号-**/
	private String phoneAccount;

	/**邮箱账号-**/
	private String emailAccount;

	/**用户代码-**/
	private String userCode;

	/**用户密码-用户密码**/
	private String password;

	/**密码盐-**/
	private String salt;

	/**用户类型-1：平台方用户 2：非平台用户**/
	private Integer userType;

	/**是否为超管-1：超级管理员 0：普通管理员**/
	private Integer isAdmin;

	/**用户姓名-用户姓名。**/
	private String name;

	/**用户移动电话-移动电话号码**/
	private String mobilePhone;

	/**用户邮件-邮件地址**/
	private String email;

	/**证书序列号-**/
	private String certSn;

	/**证书颁发这DN码-**/
	private String issuerDn;

	/**开通区块链账户ID-0：否 1：是**/
	private Long bcaId;

	/**开通区块链账户地址-0：否 1：是**/
	private String bcaAddress;

	/**开通区块链账户时间-0：否 1：是**/
	private String bcaOpenTime;

	/**是否开通区块链账户-0：否 1：是**/
	private Integer isOpenBlockAccount;

	/**是否实名-**/
	private Integer isRealname;

	/**是否禁用-0：否 1：是**/
	private Integer isForbidden;

	/**是否删除-1：是 0：否**/
	private Integer isDelete;

	/**实名认证时间-**/
	private String realnameTime;

	/**创建时间-创建时间：记录用户的创建时间。**/
	private String createTime;

	/**更新时间-**/
	private String modifyTime;

	/**备注-**/
	private String comments;

	/**用户角色关系映射表**/
	private List<UserRoleRelationOutput> listUserRoleRelation;

	/**机构信息表**/
	private OrganizationOutput organization;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public String getPhoneAccount() {
		return phoneAccount;
	}

	public void setPhoneAccount(String phoneAccount) {
		this.phoneAccount = phoneAccount;
	}
	public String getEmailAccount() {
		return emailAccount;
	}

	public void setEmailAccount(String emailAccount) {
		this.emailAccount = emailAccount;
	}
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getCertSn() {
		return certSn;
	}

	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}
	public String getIssuerDn() {
		return issuerDn;
	}

	public void setIssuerDn(String issuerDn) {
		this.issuerDn = issuerDn;
	}
	public Long getBcaId() {
		return bcaId;
	}

	public void setBcaId(Long bcaId) {
		this.bcaId = bcaId;
	}
	public String getBcaAddress() {
		return bcaAddress;
	}

	public void setBcaAddress(String bcaAddress) {
		this.bcaAddress = bcaAddress;
	}
	public String getBcaOpenTime() {
		return bcaOpenTime;
	}

	public void setBcaOpenTime(String bcaOpenTime) {
		this.bcaOpenTime = bcaOpenTime;
	}
	public Integer getIsOpenBlockAccount() {
		return isOpenBlockAccount;
	}

	public void setIsOpenBlockAccount(Integer isOpenBlockAccount) {
		this.isOpenBlockAccount = isOpenBlockAccount;
	}
	public Integer getIsRealname() {
		return isRealname;
	}

	public void setIsRealname(Integer isRealname) {
		this.isRealname = isRealname;
	}
	public Integer getIsForbidden() {
		return isForbidden;
	}

	public void setIsForbidden(Integer isForbidden) {
		this.isForbidden = isForbidden;
	}
	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	public String getRealnameTime() {
		return realnameTime;
	}

	public void setRealnameTime(String realnameTime) {
		this.realnameTime = realnameTime;
	}
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<UserRoleRelationOutput> getListUserRoleRelation() {
		return listUserRoleRelation;
	}

	public void setListUserRoleRelation(List<UserRoleRelationOutput> listUserRoleRelation) {
		this.listUserRoleRelation = listUserRoleRelation;
	}

	public OrganizationOutput getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationOutput organization) {
		this.organization = organization;
	}
}
